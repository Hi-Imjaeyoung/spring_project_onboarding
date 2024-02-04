package com.example.spring_project_onboarding.trainee.controller;

import com.example.spring_project_onboarding.trainee.domain.Trainee;
import com.example.spring_project_onboarding.trainee.dto.TraineeCreateReqDto;
import com.example.spring_project_onboarding.trainee.dto.TraineeReqDto;
import com.example.spring_project_onboarding.trainee.service.TraineeService;
import com.example.spring_project_onboarding.trainer.domain.Trainer;
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
        return "trainee create ok";
    }
    @PatchMapping("/trainee/update/{id}")
    public String updateTrainee(@PathVariable Long id, @RequestBody TraineeReqDto traineeReqDto) {
        traineeService.Update(id, traineeReqDto);
        return "trainee update Ok";
    }
    @DeleteMapping("/trainee/delete/{id}")
    public String traineeDelete(@PathVariable Long id){
        Trainee trainee = traineeService.Delete(id);
        return "trainee Delete Ok";
    }


}
