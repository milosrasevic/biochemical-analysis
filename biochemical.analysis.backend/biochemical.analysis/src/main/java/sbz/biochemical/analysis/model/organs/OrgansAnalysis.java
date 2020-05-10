package sbz.biochemical.analysis.model.organs;

import sbz.biochemical.analysis.model.organs.analysis.KidneysCondition;
import sbz.biochemical.analysis.model.organs.analysis.LiverCondition;

import java.io.Serializable;

public class OrgansAnalysis implements Serializable {

    private KidneysCondition kidneysCondition;
    private LiverCondition liverCondition;

    public OrgansAnalysis() {
    }

    public OrgansAnalysis(KidneysCondition kidneysCondition, LiverCondition liverCondition) {
        this.kidneysCondition = kidneysCondition;
        this.liverCondition = liverCondition;
    }

    public KidneysCondition getKidneysCondition() {
        return kidneysCondition;
    }

    public void setKidneysCondition(KidneysCondition kidneysCondition) {
        this.kidneysCondition = kidneysCondition;
    }

    public LiverCondition getLiverCondition() {
        return liverCondition;
    }

    public void setLiverCondition(LiverCondition liverCondition) {
        this.liverCondition = liverCondition;
    }
}
