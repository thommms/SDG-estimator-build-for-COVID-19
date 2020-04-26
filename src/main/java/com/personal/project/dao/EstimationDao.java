package com.personal.project.dao;

import com.personal.project.model.input.EstimationParameters;
import com.personal.project.model.input.Region;
import com.personal.project.model.output.EstimationOutput;

public interface EstimationDao {
    public EstimationOutput covid19ImpactEstimator(EstimationParameters estimationParameters);
}
