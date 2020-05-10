package sbz.biochemical.analysis.model.blood.analysis;


import java.io.Serializable;

public class Blood implements Serializable {

    private double leukocytes;
    private double erythrocytes;
    private double thrombocytes;
    private double hematocrit;
    private double hemoglobin;

    public Blood() {
    }

    public Blood(double leukocytes, double erythrocytes, double thrombocytes, double hematocrit, double hemoglobin) {
        this.leukocytes = leukocytes;
        this.erythrocytes = erythrocytes;
        this.thrombocytes = thrombocytes;
        this.hematocrit = hematocrit;
        this.hemoglobin = hemoglobin;
    }

    public double getLeukocytes() {
        return leukocytes;
    }

    public void setLeukocytes(double leukocytes) {
        this.leukocytes = leukocytes;
    }

    public double getErythrocytes() {
        return erythrocytes;
    }

    public void setErythrocytes(double erythrocytes) {
        this.erythrocytes = erythrocytes;
    }

    public double getThrombocytes() {
        return thrombocytes;
    }

    public void setThrombocytes(double thrombocytes) {
        this.thrombocytes = thrombocytes;
    }

    public double getHematocrit() {
        return hematocrit;
    }

    public void setHematocrit(double hematocrit) {
        this.hematocrit = hematocrit;
    }

    public double getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }
}
