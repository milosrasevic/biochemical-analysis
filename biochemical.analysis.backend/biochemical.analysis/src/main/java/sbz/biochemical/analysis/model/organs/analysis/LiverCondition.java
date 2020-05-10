package sbz.biochemical.analysis.model.organs.analysis;

import java.io.Serializable;

public class LiverCondition implements Serializable {

    private double ALT;
    private double AST;
    private double gamaGT;
    private double bilirubin;

    public LiverCondition() {
    }

    public LiverCondition(double ALT, double AST, double gamaGT, double bilirubin) {
        this.ALT = ALT;
        this.AST = AST;
        this.gamaGT = gamaGT;
        this.bilirubin = bilirubin;
    }

    public double getALT() {
        return ALT;
    }

    public void setALT(double ALT) {
        this.ALT = ALT;
    }

    public double getAST() {
        return AST;
    }

    public void setAST(double AST) {
        this.AST = AST;
    }

    public double getGamaGT() {
        return gamaGT;
    }

    public void setGamaGT(double gamaGT) {
        this.gamaGT = gamaGT;
    }

    public double getBilirubin() {
        return bilirubin;
    }

    public void setBilirubin(double bilirubin) {
        this.bilirubin = bilirubin;
    }
}
