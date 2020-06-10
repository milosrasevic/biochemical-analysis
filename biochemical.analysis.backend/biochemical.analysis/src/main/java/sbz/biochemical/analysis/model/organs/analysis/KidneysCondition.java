package sbz.biochemical.analysis.model.organs.analysis;

import java.io.Serializable;

public class KidneysCondition implements Serializable {

    private Double urea;
    private Double creatinine;

    public KidneysCondition() {
    }

    public KidneysCondition(double urea, double creatinine) {
        this.urea = urea;
        this.creatinine = creatinine;
    }

    public Double getUrea() {
        return urea;
    }

    public void setUrea(Double urea) {
        this.urea = urea;
    }

    public Double getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(Double creatinine) {
        this.creatinine = creatinine;
    }
}
