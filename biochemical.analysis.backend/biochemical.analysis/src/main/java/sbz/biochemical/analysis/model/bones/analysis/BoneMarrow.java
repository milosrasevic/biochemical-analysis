package sbz.biochemical.analysis.model.bones.analysis;

import java.io.Serializable;

public class BoneMarrow implements Serializable {

    private Double iron;

    public BoneMarrow() {
    }

    public BoneMarrow(double iron) {
        this.iron = iron;
    }

    public Double getIron() {
        return iron;
    }

    public void setIron(Double iron) {
        this.iron = iron;
    }
}
