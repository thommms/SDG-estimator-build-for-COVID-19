package com.personal.project.model.output;

public class Data {
    private String periodType;
    private Long population;
    private Region region;
    private Long reportedCases;
    private Long timeToElapse;
    private Long totalHospitalBeds;

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Long getReportedCases() {
        return reportedCases;
    }

    public void setReportedCases(Long reportedCases) {
        this.reportedCases = reportedCases;
    }

    public Long getTimeToElapse() {
        return timeToElapse;
    }

    public void setTimeToElapse(Long timeToElapse) {
        this.timeToElapse = timeToElapse;
    }

    public Long getTotalHospitalBeds() {
        return totalHospitalBeds;
    }

    public void setTotalHospitalBeds(Long totalHospitalBeds) {
        this.totalHospitalBeds = totalHospitalBeds;
    }
}
