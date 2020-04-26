package com.personal.project.service;

import com.personal.project.dao.EstimationDao;
import com.personal.project.model.input.EstimationParameters;
import com.personal.project.model.input.Region;
import com.personal.project.model.output.EstimationOutput;
import com.personal.project.model.output.Impact;
import com.personal.project.model.output.SevereImpact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstimationServiceImpl implements EstimationService {

    @Autowired
    private EstimationDao estimationDao;
    @Override
    public EstimationOutput covid19ImpactEstimator(EstimationParameters estimationParameters) {
        return estimationDao.covid19ImpactEstimator(estimationParameters);
    }
}
