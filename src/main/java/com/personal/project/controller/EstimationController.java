package com.personal.project.controller;

import com.personal.project.model.input.EstimationParameters;
import com.personal.project.model.output.EstimationOutput;
import com.personal.project.service.EstimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class EstimationController {
    @Autowired
    private EstimationService estimationService;

    @PostMapping("/doEstimation")
    public EstimationOutput getEstimation(@RequestBody final EstimationParameters estimationParameters) {
       return estimationService.covid19ImpactEstimator(estimationParameters);
    }
}
