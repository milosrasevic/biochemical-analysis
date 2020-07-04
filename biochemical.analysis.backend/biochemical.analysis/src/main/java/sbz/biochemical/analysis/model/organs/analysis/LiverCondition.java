package sbz.biochemical.analysis.model.organs.analysis;

import java.io.Serializable;

public class LiverCondition implements Serializable {

    private Double alt;
    private Double ast;
    private Double gamaGT;
    private Double bilirubin;

    public LiverCondition() {
    }

    public LiverCondition(double alt, double ast, double gamaGT, double bilirubin) {
        this.alt = alt;
        this.ast = ast;
        this.gamaGT = gamaGT;
        this.bilirubin = bilirubin;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(Double ast) {
        this.ast = ast;
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
