package com.example.spring_project_onboarding.trainer.controller;

import com.example.spring_project_onboarding.trainer.dto.TrainerCreateReqDto;
import com.example.spring_project_onboarding.trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
    private final TrainerService trainerService;
    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping("/Trainer/create")
    public String Save(@RequestBody TrainerCreateReqDto trainerCreateReqDto){
        trainerService.Save(trainerCreateReqDto);
        return "ok";
    }


}
