package sbz.biochemical.analysis.model.urine;

import sbz.biochemical.analysis.model.urine.analysis.Urine;
import sbz.biochemical.analysis.model.urine.analysis.UrineColor;

import java.io.Serializable;

public class UrineAnalysis implements Serializable {

    private Urine urine;

    public UrineAnalysis() {
    }

    public UrineAnalysis(Urine urine) {
        this.urine = urine;
    }

    public Urine getUrine() {
        return urine;
    }

    public void setUrine(Urine urine) {
        this.urine = urine;
    }

}
