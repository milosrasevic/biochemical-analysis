package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class JointsCondition implements Serializable {

    private double uricAcid;

    public JointsCondition() {
    }

    public JointsCondition(double uricAcid) {
        this.uricAcid = uricAcid;
    }

    public double getUricAcid() {
        return uricAcid;
    }

    public void setUricAcid(double uricAcid) {
        this.uricAcid = uricAcid;
    }
}
