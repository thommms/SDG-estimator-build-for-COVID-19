package com.personal.project.service;

import com.personal.project.model.input.EstimationParameters;
import com.personal.project.model.input.Region;
import com.personal.project.model.output.EstimationOutput;

public interface EstimationService {
    public EstimationOutput covid19ImpactEstimator(EstimationParameters estimationParameters);
}
