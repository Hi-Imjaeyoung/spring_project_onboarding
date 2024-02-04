package com.example.spring_project_onboarding.trainee.controller;

import com.example.spring_project_onboarding.trainee.dto.TraineeCreateReqDto;
import com.example.spring_project_onboarding.trainee.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraineeController {
    private final TraineeService traineeService;
    @Autowired
    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping("/Trainee/create")
    public String Save(@RequestBody TraineeCreateReqDto traineeCreateReqDto){
        traineeService.Save(traineeCreateReqDto);
        return "ok";
    }


}
