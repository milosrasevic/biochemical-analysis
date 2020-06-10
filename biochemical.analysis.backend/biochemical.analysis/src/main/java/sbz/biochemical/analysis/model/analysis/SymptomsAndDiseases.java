package sbz.biochemical.analysis.model.analysis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class SymptomsAndDiseases implements Serializable {

    private HashSet<String> symptoms;
    private ArrayList<String> diseasesList;

    public SymptomsAndDiseases() {
        this.symptoms = new HashSet<String>();
        this.diseasesList = new ArrayList<String>();
    }

    public SymptomsAndDiseases(HashSet<String> symptoms, ArrayList<String> diseasesList) {
        this.symptoms = symptoms;
        this.diseasesList = diseasesList;
    }

    public HashSet<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(HashSet<String> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<String> getDiseasesList() {
        return diseasesList;
    }

    public void setDiseasesList(ArrayList<String> diseasesList) {
        this.diseasesList = diseasesList;
    }
}
