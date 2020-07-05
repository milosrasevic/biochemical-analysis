package sbz.biochemical.analysis.model.mind;

import java.io.Serializable;

public class MentalDisease implements Serializable {

    private String diseaseName;
    private String user;

    public MentalDisease() {
    }

    public MentalDisease(String diseaseName, String user) {
        this.user = user;
        this.diseaseName = diseaseName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
