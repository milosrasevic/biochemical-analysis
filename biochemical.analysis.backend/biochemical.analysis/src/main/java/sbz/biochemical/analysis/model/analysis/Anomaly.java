package sbz.biochemical.analysis.model.analysis;

import java.io.Serializable;

public class Anomaly implements Serializable {

    private String description;

    public Anomaly() {
    }

    public Anomaly(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
