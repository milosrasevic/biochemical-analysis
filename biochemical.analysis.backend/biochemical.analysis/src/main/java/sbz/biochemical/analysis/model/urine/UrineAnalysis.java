package sbz.biochemical.analysis.model.urine;

import sbz.biochemical.analysis.model.urine.analysis.Urine;
import sbz.biochemical.analysis.model.urine.analysis.UrineColor;

import java.io.Serializable;

public class UrineAnalysis implements Serializable {

    private Urine urine;
    private UrineColor urineColor;

    public UrineAnalysis() {
    }

    public UrineAnalysis(Urine urine, UrineColor urineColor) {
        this.urine = urine;
        this.urineColor = urineColor;
    }

    public Urine getUrine() {
        return urine;
    }

    public void setUrine(Urine urine) {
        this.urine = urine;
    }

    public UrineColor getUrineColor() {
        return urineColor;
    }

    public void setUrineColor(UrineColor urineColor) {
        this.urineColor = urineColor;
    }
}
