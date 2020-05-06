package sbz.biochemical.analysis.model;

import sbz.biochemical.analysis.model.blood.BloodAnalysis;

import java.io.Serializable;

public class Results implements Serializable {

    private Gender gender;

    private BloodAnalysis bloodAnalysis;


    private String diagnosis;

    public Results() {
    }

    public Results(BloodAnalysis bloodAnalysis, Gender gender) {
        this.bloodAnalysis = bloodAnalysis;
        this.diagnosis = "";
        this.gender = gender;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public BloodAnalysis getBloodAnalysis() {
        return bloodAnalysis;
    }

    public void setBloodAnalysis(BloodAnalysis bloodAnalysis) {
        this.bloodAnalysis = bloodAnalysis;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
