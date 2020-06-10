package sbz.biochemical.analysis.model.blood.analysis;


import java.io.Serializable;

public class Blood implements Serializable {

    private Double leukocytes;
    private Double erythrocytes;
    private Double thrombocytes;
    private Double hematocrit;
    private Double hemoglobin;

    public Blood() {
    }

    public Blood(double leukocytes, double erythrocytes, double thrombocytes, double hematocrit, double hemoglobin) {
        this.leukocytes = leukocytes;
        this.erythrocytes = erythrocytes;
        this.thrombocytes = thrombocytes;
        this.hematocrit = hematocrit;
        this.hemoglobin = hemoglobin;
    }

    public Double getLeukocytes() {
        return leukocytes;
    }

    public void setLeukocytes(Double leukocytes) {
        this.leukocytes = leukocytes;
    }

    public Double getErythrocytes() {
        return erythrocytes;
    }

    public void setErythrocytes(Double erythrocytes) {
        this.erythrocytes = erythrocytes;
    }

    public Double getThrombocytes() {
        return thrombocytes;
    }

    public void setThrombocytes(Double thrombocytes) {
        this.thrombocytes = thrombocytes;
    }

    public Double getHematocrit() {
        return hematocrit;
    }

    public void setHematocrit(Double hematocrit) {
        this.hematocrit = hematocrit;
    }

    public Double getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(Double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }
}
