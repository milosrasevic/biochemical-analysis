package sbz.biochemical.analysis.model.urine.analysis;

import java.io.Serializable;

public class Urine implements Serializable {

    private UrineColor urineColor;
    private double protein;
    private double glucose;
    private boolean urobilinogen;
    private boolean bilirubin;
    private boolean ketones;
    private boolean leukocytes;
    private boolean bacteria;
    private boolean yeast;
    private boolean cylinders;
    private boolean semen;

    public Urine() {
    }

    public Urine(UrineColor urineColor, double protein, double glucose, boolean urobilinogen,
                 boolean bilirubin, boolean ketones, boolean leukocytes, boolean bacteria,
                 boolean yeast, boolean cylinders, boolean semen) {
        this.urineColor = urineColor;
        this.protein = protein;
        this.glucose = glucose;
        this.urobilinogen = urobilinogen;
        this.bilirubin = bilirubin;
        this.ketones = ketones;
        this.leukocytes = leukocytes;
        this.bacteria = bacteria;
        this.yeast = yeast;
        this.cylinders = cylinders;
        this.semen = semen;
    }

    public UrineColor getUrineColor() {
        return urineColor;
    }

    public void setUrineColor(UrineColor urineColor) {
        this.urineColor = urineColor;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getGlucose() {
        return glucose;
    }

    public void setGlucose(double glucose) {
        this.glucose = glucose;
    }

    public boolean isUrobilinogen() {
        return urobilinogen;
    }

    public void setUrobilinogen(boolean urobilinogen) {
        this.urobilinogen = urobilinogen;
    }

    public boolean isBilirubin() {
        return bilirubin;
    }

    public void setBilirubin(boolean bilirubin) {
        this.bilirubin = bilirubin;
    }

    public boolean isKetones() {
        return ketones;
    }

    public void setKetones(boolean ketones) {
        this.ketones = ketones;
    }

    public boolean isLeukocytes() {
        return leukocytes;
    }

    public void setLeukocytes(boolean leukocytes) {
        this.leukocytes = leukocytes;
    }

    public boolean isBacteria() {
        return bacteria;
    }

    public void setBacteria(boolean bacteria) {
        this.bacteria = bacteria;
    }

    public boolean isYeast() {
        return yeast;
    }

    public void setYeast(boolean yeast) {
        this.yeast = yeast;
    }

    public boolean isCylinders() {
        return cylinders;
    }

    public void setCylinders(boolean cylinders) {
        this.cylinders = cylinders;
    }

    public boolean isSemen() {
        return semen;
    }

    public void setSemen(boolean semen) {
        this.semen = semen;
    }
}
