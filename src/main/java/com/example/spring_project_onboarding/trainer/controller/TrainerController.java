package com.example.spring_project_onboarding.trainer.controller;

import com.example.spring_project_onboarding.trainer.domain.Trainer;
import com.example.spring_project_onboarding.trainer.dto.TrainerCreateReqDto;
import com.example.spring_project_onboarding.trainer.dto.TrainerReqDto;
import com.example.spring_project_onboarding.trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping("/trainer/create")
    public String Save(@RequestBody TrainerCreateReqDto trainerCreateReqDto){
        trainerService.Save(trainerCreateReqDto);
        return "Create ok";
    }
    @PatchMapping("/trainer/update/{id}")
    public String updateTrainer(@PathVariable Long id, @RequestBody TrainerReqDto trainerReqDto) {
        trainerService.Update(id, trainerReqDto);
        return "Update Ok";
    }
    @DeleteMapping("/trainer/delete/{id}/")
    public String itemDelete(@PathVariable Long id){
        Trainer trainer = trainerService.Delete(id);
        return "Delete Ok";
    }


}
