package sbz.biochemical.analysis.model.minerals;

import java.io.Serializable;

public class Electrolytes implements Serializable {

    private double sodium;
    private double potassium;

    public Electrolytes() {
    }

    public Electrolytes(double sodium, double potassium) {
        this.sodium = sodium;
        this.potassium = potassium;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }
}
