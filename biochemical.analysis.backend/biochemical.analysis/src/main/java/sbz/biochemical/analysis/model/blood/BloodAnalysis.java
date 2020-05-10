package sbz.biochemical.analysis.model.blood;

import sbz.biochemical.analysis.model.blood.analysis.BiochemicalParameters;
import sbz.biochemical.analysis.model.blood.analysis.Blood;
import sbz.biochemical.analysis.model.blood.analysis.Fat;
import sbz.biochemical.analysis.model.blood.analysis.OtherParameters;

import java.io.Serializable;

public class BloodAnalysis implements Serializable {

    private Blood blood;
    private BiochemicalParameters biochemicalParameters;
    private Fat fat;
    private OtherParameters otherParameters;

    public BloodAnalysis() {
    }

    public BloodAnalysis(Blood blood, BiochemicalParameters biochemicalParameters, Fat fat, OtherParameters otherParameters) {
        this.blood = blood;
        this.biochemicalParameters = biochemicalParameters;
        this.fat = fat;
        this.otherParameters = otherParameters;
    }

    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }

    public BiochemicalParameters getBiochemicalParameters() {
        return biochemicalParameters;
    }

    public void setBiochemicalParameters(BiochemicalParameters biochemicalParameters) {
        this.biochemicalParameters = biochemicalParameters;
    }

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public OtherParameters getOtherParameters() {
        return otherParameters;
    }

    public void setOtherParameters(OtherParameters otherParameters) {
        this.otherParameters = otherParameters;
    }
}
