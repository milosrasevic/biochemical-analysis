package sbz.biochemical.analysis.model.mind;

import java.io.Serializable;
import java.util.ArrayList;

public class MentalDiseases implements Serializable {

    private ArrayList<MentalDisease> mentalDiseases;

    public MentalDiseases() {
        this.mentalDiseases = new ArrayList<MentalDisease>();
    }

    public MentalDiseases(ArrayList<MentalDisease> mentalDiseases) {
        this.mentalDiseases = mentalDiseases;
    }

    public ArrayList<MentalDisease> getMentalDiseases() {
        return mentalDiseases;
    }

    public void setMentalDiseases(ArrayList<MentalDisease> mentalDiseases) {
        this.mentalDiseases = mentalDiseases;
    }
}
