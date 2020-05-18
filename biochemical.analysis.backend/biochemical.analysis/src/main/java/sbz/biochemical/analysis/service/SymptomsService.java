package sbz.biochemical.analysis.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.model.Symptoms;

@Service
public class SymptomsService {

    private final KieContainer kieContainer;

    @Autowired
    public SymptomsService(KieContainer kieContainer) { this.kieContainer = kieContainer; }

    public String getDiagnosis(Symptoms s) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(s);
        kieSession.fireAllRules();
        kieSession.dispose();
        return s.getDiagnosis();
    }
}
