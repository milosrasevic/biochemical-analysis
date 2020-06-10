package sbz.biochemical.analysis.model.minerals;

import java.io.Serializable;

public class Electrolytes implements Serializable {

    private Double sodium;
    private Double potassium;

    public Electrolytes() {
    }

    public Electrolytes(double sodium, double potassium) {
        this.sodium = sodium;
        this.potassium = potassium;
    }

    public Double getSodium() {
        return sodium;
    }

    public void setSodium(Double sodium) {
        this.sodium = sodium;
    }

    public Double getPotassium() {
        return potassium;
    }

    public void setPotassium(Double potassium) {
        this.potassium = potassium;
    }
}
