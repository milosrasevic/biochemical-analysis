package sbz.biochemical.analysis.model.organs.analysis;

import java.io.Serializable;

public class KidneysCondition implements Serializable {

    private double urea;
    private double creatinine;

    public KidneysCondition() {
    }

    public KidneysCondition(double urea, double creatinine) {
        this.urea = urea;
        this.creatinine = creatinine;
    }

    public double getUrea() {
        return urea;
    }

    public void setUrea(double urea) {
        this.urea = urea;
    }

    public double getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(double creatinine) {
        this.creatinine = creatinine;
    }
}
