package sbz.biochemical.analysis.model.analysis;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Diagnosis {

    private ArrayList<String> possibleDiseases;
    private ArrayList<String> highChanceDiseases;
    private String mostLikelyDisease;

    public Diagnosis() {
        this.highChanceDiseases = new ArrayList<String>();
        this.possibleDiseases = new ArrayList<String>();
        this.mostLikelyDisease = "";
    }

    public Diagnosis(ArrayList<String> possibleDiseases, ArrayList<String> highChanceDiseases, String mostLikelyDisease) {
        this.possibleDiseases = possibleDiseases;
        this.highChanceDiseases = highChanceDiseases;
        this.mostLikelyDisease = mostLikelyDisease;
    }

    public ArrayList<String> getHighChanceDiseases() {
        return highChanceDiseases;
    }

    public void setHighChanceDiseases(ArrayList<String> highChanceDiseases) {
        this.highChanceDiseases = highChanceDiseases;
    }

    public String getMostLikelyDisease() {
        return mostLikelyDisease;
    }

    public void setMostLikelyDisease(String mostLikelyDisease) {
        this.mostLikelyDisease = mostLikelyDisease;
    }

    public ArrayList<String> getPossibleDiseases() {
        return possibleDiseases;
    }

    public void setPossibleDiseases(ArrayList<String> possibleDiseases) {
        this.possibleDiseases = possibleDiseases;
    }
}
