package sbz.biochemical.analysis.model.organs.analysis;

import java.io.Serializable;

public class LiverCondition implements Serializable {

    private Double ALT;
    private Double AST;
    private Double gamaGT;
    private Double bilirubin;

    public LiverCondition() {
    }

    public LiverCondition(double ALT, double AST, double gamaGT, double bilirubin) {
        this.ALT = ALT;
        this.AST = AST;
        this.gamaGT = gamaGT;
        this.bilirubin = bilirubin;
    }

    public Double getALT() {
        return ALT;
    }

    public void setALT(Double ALT) {
        this.ALT = ALT;
    }

    public Double getAST() {
        return AST;
    }

    public void setAST(Double AST) {
        this.AST = AST;
    }

    public Double getGamaGT() {
        return gamaGT;
    }

    public void setGamaGT(Double gamaGT) {
        this.gamaGT = gamaGT;
    }

    public Double getBilirubin() {
        return bilirubin;
    }

    public void setBilirubin(Double bilirubin) {
        this.bilirubin = bilirubin;
    }
}
