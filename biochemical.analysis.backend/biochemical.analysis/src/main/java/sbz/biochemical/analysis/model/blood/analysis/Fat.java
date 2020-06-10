package sbz.biochemical.analysis.model.blood.analysis;

import java.io.Serializable;

public class Fat implements Serializable {

    private Double cholesterol;
    private Double hdlCholesterol;
    private Double ldlCholesterol;
    private Double triglycerides;

    public Fat() {
    }

    public Fat(double cholesterol, double hdlCholesterol, double ldlCholesterol, double triglycerides) {
        this.cholesterol = cholesterol;
        this.hdlCholesterol = hdlCholesterol;
        this.ldlCholesterol = ldlCholesterol;
        this.triglycerides = triglycerides;
    }

    public Double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(Double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public Double getLdlCholesterol() {
        return ldlCholesterol;
    }

    public void setLdlCholesterol(Double ldlCholesterol) {
        this.ldlCholesterol = ldlCholesterol;
    }

    public Double getTriglycerides() {
        return triglycerides;
    }

    public void setTriglycerides(Double triglycerides) {
        this.triglycerides = triglycerides;
    }
}
