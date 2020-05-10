package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class BonesCondition implements Serializable {

    private double alkalinePhosphatase;

    public BonesCondition() {
    }

    public BonesCondition(double alkalinePhosphatase) {
        this.alkalinePhosphatase = alkalinePhosphatase;
    }

    public double getAlkalinePhosphatase() {
        return alkalinePhosphatase;
    }

    public void setAlkalinePhosphatase(double alkalinePhosphatase) {
        this.alkalinePhosphatase = alkalinePhosphatase;
    }
}
