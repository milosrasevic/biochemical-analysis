package sbz.biochemical.analysis.mindstate;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class MindStateSessionSingleton {

    private static MindStateSessionSingleton kieSessionSingletonInstance = null;

    private KieSession kieSession;

    public static MindStateSessionSingleton getInstance(KieContainer kieContainer) {
        if (kieSessionSingletonInstance == null) {
            kieSessionSingletonInstance = new MindStateSessionSingleton(kieContainer);
        }
        return kieSessionSingletonInstance;
    }

    public MindStateSessionSingleton(KieContainer kieContainer) {
        this.kieSession = kieContainer.newKieSession();
    }

    public KieSession getKieSession() {
        return kieSession;
    }

    public void setKieSession(KieSession kieSession) {
        this.kieSession = kieSession;
    }
}