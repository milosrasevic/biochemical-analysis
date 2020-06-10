package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class JointsCondition implements Serializable {

    private Double uricAcid;

    public JointsCondition() {
    }

    public JointsCondition(double uricAcid) {
        this.uricAcid = uricAcid;
    }

    public Double getUricAcid() {
        return uricAcid;
    }

    public void setUricAcid(Double uricAcid) {
        this.uricAcid = uricAcid;
    }
}
