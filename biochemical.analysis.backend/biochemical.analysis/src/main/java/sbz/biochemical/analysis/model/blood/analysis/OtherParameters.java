package sbz.biochemical.analysis.model.blood.analysis;

import java.io.Serializable;

public class OtherParameters implements Serializable {

    private Double fibrinogen;
    private boolean proteins;
    private Double pt;

    public OtherParameters() {
    }

    public OtherParameters(double fibrinogen, boolean proteins, double pt) {
        this.fibrinogen = fibrinogen;
        this.proteins = proteins;
        this.pt = pt;
    }

    public Double getFibrinogen() {
        return fibrinogen;
    }

    public void setFibrinogen(Double fibrinogen) {
        this.fibrinogen = fibrinogen;
    }

    public boolean isProteins() {
        return proteins;
    }

    public void setProteins(boolean proteins) {
        this.proteins = proteins;
    }

    public Double getPt() {
        return pt;
    }

    public void setPt(Double pt) {
        this.pt = pt;
    }
}
