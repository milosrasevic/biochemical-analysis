package sbz.biochemical.analysis.model;

import java.io.Serializable;

public class Symptoms implements Serializable {

    private boolean lossOfAppetite;

    private String diagnosis;

    public Symptoms() {
    }

    public Symptoms(boolean lossOfAppetite) {
        this.lossOfAppetite = lossOfAppetite;
        this.diagnosis = "";
    }

    public boolean isLossOfAppetite() {
        return lossOfAppetite;
    }

    public void setLossOfAppetite(boolean lossOfAppetite) {
        this.lossOfAppetite = lossOfAppetite;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
