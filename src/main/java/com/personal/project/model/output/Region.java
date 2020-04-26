package com.personal.project.model.output;

public class Region {
    private String name;
    private Double avgAge;
    private Double avgDailyIncomeInUSD;
    private Double avgDailyIncomePopulation;

    public Double getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(Double avgAge) {
        this.avgAge = avgAge;
    }

    public Double getAvgDailyIncomeInUSD() {
        return avgDailyIncomeInUSD;
    }

    public void setAvgDailyIncomeInUSD(Double avgDailyIncomeInUSD) {
        this.avgDailyIncomeInUSD = avgDailyIncomeInUSD;
    }

    public Double getAvgDailyIncomePopulation() {
        return avgDailyIncomePopulation;
    }

    public void setAvgDailyIncomePopulation(Double avgDailyIncomePopulation) {
        this.avgDailyIncomePopulation = avgDailyIncomePopulation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
