package sbz.biochemical.analysis.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sbz.biochemical.analysis.model.Results;

import java.util.ArrayList;

@Service
public class ResultsService {

    private final KieContainer kieContainer;

    @Autowired
    public ResultsService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public ArrayList<String> getSymptomsToCheck(Results r) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(r);
        kieSession.fireAllRules();
        kieSession.dispose();
        return r.getSymptomsToCheck();
    }

}
