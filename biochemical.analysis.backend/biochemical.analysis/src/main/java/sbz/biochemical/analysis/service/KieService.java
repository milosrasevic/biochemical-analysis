package sbz.biochemical.analysis.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.model.analysis.Results;
import sbz.biochemical.analysis.model.analysis.SymptomsAndDiseases;

@Service
public class KieService {

//    private final KieContainer kieContainer;
    private final KieSession kieSession;

    @Autowired
    public KieService(KieContainer kieContainer) {
//        this.kieContainer = kieContainer;
        this.kieSession = kieContainer.newKieSession();
    }

    public void insertSymptoms(SymptomsAndDiseases s) {
        this.kieSession.insert(s);
    }

    public void insertResults(Results r) {
        this.kieSession.insert(r);
    }

    public void fireRules() {
        this.kieSession.fireAllRules();
    }

    public void disposeSession() {
        this.kieSession.dispose();
    }

}
