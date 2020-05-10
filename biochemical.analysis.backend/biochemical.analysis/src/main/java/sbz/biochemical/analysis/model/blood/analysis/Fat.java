package sbz.biochemical.analysis.model.blood.analysis;

import java.io.Serializable;

public class Fat implements Serializable {

    private double cholesterol;
    private double HDLcholesterol;
    private double LDLcholesterol;
    private double triglycerides;

    public Fat() {
    }

    public Fat(double cholesterol, double HDLcholesterol, double LDLcholesterol, double triglycerides) {
        this.cholesterol = cholesterol;
        this.HDLcholesterol = HDLcholesterol;
        this.LDLcholesterol = LDLcholesterol;
        this.triglycerides = triglycerides;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getHDLcholesterol() {
        return HDLcholesterol;
    }

    public void setHDLcholesterol(double HDLcholesterol) {
        this.HDLcholesterol = HDLcholesterol;
    }

    public double getLDLcholesterol() {
        return LDLcholesterol;
    }

    public void setLDLcholesterol(double LDLcholesterol) {
        this.LDLcholesterol = LDLcholesterol;
    }

    public double getTriglycerides() {
        return triglycerides;
    }

    public void setTriglycerides(double triglycerides) {
        this.triglycerides = triglycerides;
    }
}
