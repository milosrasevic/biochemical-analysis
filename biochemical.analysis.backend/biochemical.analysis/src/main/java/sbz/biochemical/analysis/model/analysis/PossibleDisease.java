package sbz.biochemical.analysis.model.analysis;

import java.io.Serializable;

public class PossibleDisease implements Serializable {

    private String description;

    public PossibleDisease() {
    }

    public PossibleDisease(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
