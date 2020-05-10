package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class BoneMarrow implements Serializable {

    private double iron;

    public BoneMarrow() {
    }

    public BoneMarrow(double iron) {
        this.iron = iron;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }
}
