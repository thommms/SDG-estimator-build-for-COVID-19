package com.personal.project.model.input;

public class EstimationParameters {
    private Region region;
    private String periodType;
    private Long timeToElapse;
    private Long reportedCases;
    private Long population;
    private Long totalHospitalBeds;

    public Region getRegion() {
        return region;
    }

    public void setRegions(Region region) {
        this.region = region;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public Long getReportedCases() {
        return reportedCases;
    }

    public Long getTimeToElapse() {
        return timeToElapse;
    }

    public Long getPopulation() {
        return population;
    }

    public Long getTotalHospitalBeds() {
        return totalHospitalBeds;
    }

    public void setTimeToElapse(Long timeToElapse) {
        this.timeToElapse = timeToElapse;
    }

    public void setReportedCases(Long reportedCases) {
        this.reportedCases = reportedCases;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public void setTotalHospitalBeds(Long totalHospitalBeds) {
        this.totalHospitalBeds = totalHospitalBeds;
    }
}
