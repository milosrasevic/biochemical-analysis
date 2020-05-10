package sbz.biochemical.analysis.model.blood.analysis;

import java.io.Serializable;

public class BiochemicalParameters implements Serializable {

    private SerumLook serumLook;
    private double glucose;

    public BiochemicalParameters() {
    }

    public BiochemicalParameters(SerumLook serumLook, double glucose) {
        this.serumLook = serumLook;
        this.glucose = glucose;
    }

    public SerumLook getSerumLook() {
        return serumLook;
    }

    public void setSerumLook(SerumLook serumLook) {
        this.serumLook = serumLook;
    }

    public double getGlucose() {
        return glucose;
    }

    public void setGlucose(double glucose) {
        this.glucose = glucose;
    }
}
