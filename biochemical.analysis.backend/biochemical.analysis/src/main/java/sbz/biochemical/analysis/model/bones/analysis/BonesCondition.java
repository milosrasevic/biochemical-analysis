package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class BonesCondition implements Serializable {

    private Double alkalinePhosphatase;

    public BonesCondition() {
    }

    public BonesCondition(double alkalinePhosphatase) {
        this.alkalinePhosphatase = alkalinePhosphatase;
    }

    public Double getAlkalinePhosphatase() {
        return alkalinePhosphatase;
    }

    public void setAlkalinePhosphatase(Double alkalinePhosphatase) {
        this.alkalinePhosphatase = alkalinePhosphatase;
    }
}
