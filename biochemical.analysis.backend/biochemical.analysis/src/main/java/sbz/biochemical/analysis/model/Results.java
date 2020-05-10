package sbz.biochemical.analysis.model;

import sbz.biochemical.analysis.model.blood.BloodAnalysis;
import sbz.biochemical.analysis.model.bones.BonesAnalysis;
import sbz.biochemical.analysis.model.minerals.Electrolytes;
import sbz.biochemical.analysis.model.organs.OrgansAnalysis;
import sbz.biochemical.analysis.model.urine.UrineAnalysis;

import java.io.Serializable;

public class Results implements Serializable {

    private Gender gender;
    private BloodAnalysis bloodAnalysis;
    private BonesAnalysis bonesAnalysis;
    private Electrolytes electrolytes;
    private OrgansAnalysis organsAnalysis;
    private UrineAnalysis urineAnalysis;
    private String diagnosis;

    public Results() {
    }

    public Results(Gender gender, BloodAnalysis bloodAnalysis, BonesAnalysis bonesAnalysis,
                   Electrolytes electrolytes, OrgansAnalysis organsAnalysis,
                   UrineAnalysis urineAnalysis) {
        this.gender = gender;
        this.bloodAnalysis = bloodAnalysis;
        this.bonesAnalysis = bonesAnalysis;
        this.electrolytes = electrolytes;
        this.organsAnalysis = organsAnalysis;
        this.urineAnalysis = urineAnalysis;
        this.diagnosis = "";
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodAnalysis getBloodAnalysis() {
        return bloodAnalysis;
    }

    public void setBloodAnalysis(BloodAnalysis bloodAnalysis) {
        this.bloodAnalysis = bloodAnalysis;
    }

    public BonesAnalysis getBonesAnalysis() {
        return bonesAnalysis;
    }

    public void setBonesAnalysis(BonesAnalysis bonesAnalysis) {
        this.bonesAnalysis = bonesAnalysis;
    }

    public Electrolytes getElectrolytes() {
        return electrolytes;
    }

    public void setElectrolytes(Electrolytes electrolytes) {
        this.electrolytes = electrolytes;
    }

    public OrgansAnalysis getOrgansAnalysis() {
        return organsAnalysis;
    }

    public void setOrgansAnalysis(OrgansAnalysis organsAnalysis) {
        this.organsAnalysis = organsAnalysis;
    }

    public UrineAnalysis getUrineAnalysis() {
        return urineAnalysis;
    }

    public void setUrineAnalysis(UrineAnalysis urineAnalysis) {
        this.urineAnalysis = urineAnalysis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
