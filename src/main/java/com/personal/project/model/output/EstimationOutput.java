package com.personal.project.model.output;

public class EstimationOutput {
    private Data data;
    private Impact impact;
    private SevereImpact severeImpact;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Impact getImpact() {
        return impact;
    }

    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    public SevereImpact getSevereImpact() {
        return severeImpact;
    }

    public void setSevereImpact(SevereImpact severeImpact) {
        this.severeImpact = severeImpact;
    }
}
