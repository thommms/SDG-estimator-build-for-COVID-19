package com.personal.project.model.output;

public class Impact {

    private Long infectionsByRequestTime;
    private Long currentlyInfected;
    private Long severeCasesByRequestedTime;
    private Long hospitalBedsByRequestedTime;
    private Long casesForICUByRequestedTime;
    private Long casesForVentilatorsByRequestedTime;
    private Long dollarsInFlight;

    public Long getInfectionsByRequestTime() {
        return infectionsByRequestTime;
    }

    public void setInfectionsByRequestTime(Long infectionsByRequestTime) {
        this.infectionsByRequestTime = infectionsByRequestTime;
    }

    public Long getCurrentlyInfected() {
        return currentlyInfected;
    }

    public void setCurrentlyInfected(Long currentlyInfected) {
        this.currentlyInfected = currentlyInfected;
    }

    public Long getSevereCasesByRequestedTime() {
        return severeCasesByRequestedTime;
    }

    public void setSevereCasesByRequestedTime(Long severeCasesByRequestedTime) {
        this.severeCasesByRequestedTime = severeCasesByRequestedTime;
    }

    public Long getHospitalBedsByRequestedTime() {
        return hospitalBedsByRequestedTime;
    }

    public void setHospitalBedsByRequestedTime(Long hospitalBedsByRequestedTime) {
        this.hospitalBedsByRequestedTime = hospitalBedsByRequestedTime;
    }

    public Long getCasesForICUByRequestedTime() {
        return casesForICUByRequestedTime;
    }

    public void setCasesForICUByRequestedTime(Long casesForICUByRequestedTime) {
        this.casesForICUByRequestedTime = casesForICUByRequestedTime;
    }

    public Long getCasesForVentilatorsByRequestedTime() {
        return casesForVentilatorsByRequestedTime;
    }

    public void setCasesForVentilatorsByRequestedTime(Long casesForVentilatorsByRequestedTime) {
        this.casesForVentilatorsByRequestedTime = casesForVentilatorsByRequestedTime;
    }

    public Long getDollarsInFlight() {
        return dollarsInFlight;
    }

    public void setDollarsInFlight(Long dollarsInFlight) {
        this.dollarsInFlight = dollarsInFlight;
    }
}
