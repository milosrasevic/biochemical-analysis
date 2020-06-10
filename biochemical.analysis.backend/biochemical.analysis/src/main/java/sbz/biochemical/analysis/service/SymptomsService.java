package sbz.biochemical.analysis.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.model.analysis.Diagnosis;
import sbz.biochemical.analysis.model.analysis.SymptomsAndDiseases;

@Service
public class SymptomsService {

    private final KieContainer kieContainer;

    @Autowired
    public SymptomsService(KieContainer kieContainer) { this.kieContainer = kieContainer; }

    public Diagnosis getDiagnosis(SymptomsAndDiseases s) {
        KieSession kieSession = kieContainer.newKieSession();
        Diagnosis diagnosis = new Diagnosis();
        kieSession.setGlobal("diagnosis", diagnosis);
        kieSession.insert(s);
        kieSession.fireAllRules();
        diagnosis = (Diagnosis) kieSession.getGlobal("diagnosis");
        kieSession.dispose();
        return diagnosis;
    }
}
