package sbz.biochemical.analysis.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.model.analysis.Results;
import sbz.biochemical.analysis.model.analysis.SymptomsAndDiseases;

@Service
public class ResultsService {

    private final KieContainer kieContainer;

    @Autowired
    public ResultsService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public SymptomsAndDiseases getSymptomsToCheck(Results r) {
        KieSession kieSession = kieContainer.newKieSession();
        SymptomsAndDiseases symptomsAndDiseases = new SymptomsAndDiseases();
        kieSession.setGlobal("symptomsAndDiseases", symptomsAndDiseases);
        kieSession.insert(r);
        kieSession.fireAllRules();
        symptomsAndDiseases = (SymptomsAndDiseases)
                kieSession.getGlobal("symptomsAndDiseases");
        kieSession.dispose();
        return symptomsAndDiseases;
    }
}
