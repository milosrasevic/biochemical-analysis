package sbz.biochemical.analysis.service;

import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.exception.MindStateAlreadyLogged;
import sbz.biochemical.analysis.mindstate.MindStateSessionSingleton;
import sbz.biochemical.analysis.model.mind.*;
import sbz.biochemical.analysis.model.user.User;
import sbz.biochemical.analysis.repository.DailyMindStateRepository;
import sbz.biochemical.analysis.repository.UserRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
public class DailyMindStateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DailyMindStateRepository dailyMindStateRepository;

    @Autowired
    private KieContainer kieContainer;

    public MentalDiseases logTodaysMindState(String username, DailyMindStateDTO dailyMindStateDTO) throws
            MindStateAlreadyLogged {

        User user = userRepository.findByUsername(username);
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String todayString = dateFormat.format(today);

//        Optional<DailyMindState> dailyMindStateOptional = dailyMindStateRepository.findByUserIdAndDay(user.getId(),
//                todayString);
//
//        if(dailyMindStateOptional.isPresent()) {
//            throw new MindStateAlreadyLogged();
//        }

        DailyMindState dailyMindState = new DailyMindState();

        dailyMindState.setDay(todayString);
        dailyMindState.setMood(dailyMindStateDTO.getMood());
        dailyMindState.setUser(user);

        dailyMindStateRepository.save(dailyMindState);

        return checkMentalHealth(new DailyMindStateEvent(dailyMindState.getMood(), username));
    }

    private MentalDiseases checkMentalHealth(DailyMindStateEvent dmse) {
        MindStateSessionSingleton mindStateSessionSingleton = MindStateSessionSingleton.getInstance(kieContainer);
        KieSession kieSession = mindStateSessionSingleton.getKieSession();

        MentalDiseases mentalDiseases = new MentalDiseases();
        kieSession.setGlobal("mentalDiseases", mentalDiseases);

        kieSession.insert(dmse);
        kieSession.fireAllRules();

        MentalDiseases discoveredMentalDiseases = (MentalDiseases) kieSession.getGlobal("mentalDiseases");

        if (discoveredMentalDiseases.getMentalDiseases().size() != 0) {
            clearDiseasesDiscovered(kieSession, dmse.getMood());
        }

        return discoveredMentalDiseases;
    }

    private void clearDiseasesDiscovered(KieSession kieSession, Mood mood) {
        Collection<FactHandle> dailyMindStateEventHandles = kieSession.getFactHandles(new ClassObjectFilter(DailyMindStateEvent.class));
        for (FactHandle handle : dailyMindStateEventHandles) {
            DailyMindStateEvent dailyMindStateEvent = (DailyMindStateEvent) kieSession.getObject(handle);
            if (dailyMindStateEvent.getMood().equals(mood)) {
                kieSession.delete(handle);
            }
        }
        Collection<FactHandle> unhealthyFeelingsEventHandles = kieSession.getFactHandles(new ClassObjectFilter(UnhealthyFeelingsEvent.class));
        for (FactHandle handle : unhealthyFeelingsEventHandles) {
            kieSession.delete(handle);
        }
        Collection<FactHandle> diseasesDiscoveredHandles = kieSession.getFactHandles(new ClassObjectFilter(DiseaseDiscovered.class));
        for (FactHandle handle : diseasesDiscoveredHandles) {
            kieSession.delete(handle);
        }
    }
}
