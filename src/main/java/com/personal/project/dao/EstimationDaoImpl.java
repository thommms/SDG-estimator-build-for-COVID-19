package com.personal.project.dao;

import com.personal.project.model.input.EstimationParameters;
import com.personal.project.model.output.*;
import org.springframework.stereotype.Repository;

@Repository
public class EstimationDaoImpl implements EstimationDao {
    private Long impactCurrentlyInfected;
    private Long sevImpCurrentlyInfected;
    private Long numberOfTimes;
    private Long daysInterval = Long.valueOf(3);
    private Long percentInfection;
    private Long percentHospitalBed;
    private Long percentInfectedPeople;
    private Long percentageVentilators;
    private double amountOfDollarsInfectionsRate;

    @Override
    public EstimationOutput covid19ImpactEstimator(EstimationParameters estimationParameters) {

        //set Data output
        Data data = new Data();
        Region region = new Region();
        data.setPeriodType(estimationParameters.getPeriodType());
        data.setPopulation(estimationParameters.getPopulation());
        data.setReportedCases(estimationParameters.getReportedCases());
        data.setTimeToElapse(estimationParameters.getTimeToElapse());
        data.setTotalHospitalBeds(estimationParameters.getTotalHospitalBeds());
        region.setAvgDailyIncomePopulation(estimationParameters.getRegion().getAvgDailyIncomePopulation());
        region.setAvgAge(estimationParameters.getRegion().getAvgAge());
        region.setAvgDailyIncomeInUSD(estimationParameters.getRegion().getAvgDailyIncomeInUSD());
        region.setName(estimationParameters.getRegion().getName());
        data.setRegion(region);

        //impact
        Impact impact = new Impact();
        impactCurrentlyInfected = estimationParameters.getReportedCases() * 10;
        impact.setCurrentlyInfected(impactCurrentlyInfected);
        numberOfTimes = estimationParameters.getTimeToElapse() / daysInterval;
        impact.setInfectionsByRequestTime((long) (impactCurrentlyInfected * Math.pow(2, numberOfTimes)));
        percentInfection = (long) (0.15 * impact.getInfectionsByRequestTime());
        impact.setSevereCasesByRequestedTime(percentInfection);
        percentHospitalBed = (long) (0.35 * estimationParameters.getTotalHospitalBeds()-impact.getSevereCasesByRequestedTime());
        impact.setHospitalBedsByRequestedTime(percentHospitalBed);
        percentInfectedPeople = (long) (0.05 * impact.getInfectionsByRequestTime());
        impact.setCasesForICUByRequestedTime( percentInfectedPeople);
        percentageVentilators = (long)(0.02 * impact.getInfectionsByRequestTime());
        impact.setCasesForVentilatorsByRequestedTime( percentageVentilators);
        amountOfDollarsInfectionsRate = (impact.getInfectionsByRequestTime() *estimationParameters.getRegion().getAvgDailyIncomePopulation()) *
                estimationParameters.getRegion().getAvgDailyIncomeInUSD() * estimationParameters.getTimeToElapse();
        impact.setDollarsInFlight((long) amountOfDollarsInfectionsRate);

        //severeImpact
        SevereImpact severeImpact = new SevereImpact();
        sevImpCurrentlyInfected = estimationParameters.getReportedCases() * 50;
        severeImpact.setCurrentlyInfected(sevImpCurrentlyInfected);
        numberOfTimes = estimationParameters.getTimeToElapse() / daysInterval;
        severeImpact.setInfectionsByRequestTime((long) (sevImpCurrentlyInfected * Math.pow(2, numberOfTimes)));
        percentInfection = (long)  (0.15 * severeImpact.getInfectionsByRequestTime());
        severeImpact.setSevereCasesByRequestedTime( percentInfection);
        percentHospitalBed =  (long) (0.35 * estimationParameters.getTotalHospitalBeds()-severeImpact.getSevereCasesByRequestedTime());
        severeImpact.setHospitalBedsByRequestedTime((long) percentHospitalBed);
        percentInfectedPeople = (long)  (0.05 * severeImpact.getInfectionsByRequestTime());
        severeImpact.setCasesForICUByRequestedTime( percentInfectedPeople);
        percentageVentilators = (long)(0.02 * severeImpact.getInfectionsByRequestTime());
        severeImpact.setCasesForVentilatorsByRequestedTime( percentageVentilators);
        amountOfDollarsInfectionsRate = (severeImpact.getInfectionsByRequestTime() *estimationParameters.getRegion().getAvgDailyIncomePopulation()) *
                estimationParameters.getRegion().getAvgDailyIncomeInUSD() * estimationParameters.getTimeToElapse();
        severeImpact.setDollarsInFlight((long)amountOfDollarsInfectionsRate);

        //set the output
        EstimationOutput estimationOutput = new EstimationOutput();
        estimationOutput.setImpact(impact);
        estimationOutput.setSevereImpact(severeImpact);
        estimationOutput.setData(data);
        return estimationOutput;
    }
}
