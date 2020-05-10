package sbz.biochemical.analysis.model.blood.analysis;

import java.io.Serializable;

public class OtherParameters implements Serializable {

    private double fibrinogen;
    private boolean proteins;
    private double PT;

    public OtherParameters() {
    }

    public OtherParameters(double fibrinogen, boolean proteins, double PT) {
        this.fibrinogen = fibrinogen;
        this.proteins = proteins;
        this.PT = PT;
    }

    public double getFibrinogen() {
        return fibrinogen;
    }

    public void setFibrinogen(double fibrinogen) {
        this.fibrinogen = fibrinogen;
    }

    public boolean isProteins() {
        return proteins;
    }

    public void setProteins(boolean proteins) {
        this.proteins = proteins;
    }

    public double getPT() {
        return PT;
    }

    public void setPT(double PT) {
        this.PT = PT;
    }
}
