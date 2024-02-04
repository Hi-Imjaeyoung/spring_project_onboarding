package com.example.spring_project_onboarding.trainee.controller;

import com.example.spring_project_onboarding.trainee.dto.TraineeCreateReqDto;
import com.example.spring_project_onboarding.trainee.service.TraineeService;
import com.example.spring_project_onboarding.trainer.dto.TrainerReqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TraineeController {
    private final TraineeService traineeService;
    @Autowired
    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping("/trainee/create")
    public String Save(@RequestBody TraineeCreateReqDto traineeCreateReqDto){
        traineeService.Save(traineeCreateReqDto);
        return "ok";
    }


}
