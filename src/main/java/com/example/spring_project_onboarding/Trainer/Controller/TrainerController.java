package com.example.spring_project_onboarding.Trainer.Controller;


import com.example.spring_project_onboarding.Trainer.Dto.TrainerCreateReqDto;
import com.example.spring_project_onboarding.Trainer.Service.TrainerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping("/Trainer/create")
    public String Save(@RequestBody TrainerCreateReqDto trainerCreateReqDto){
        trainerService.Save(trainerCreateReqDto);
        return "ok";
    }

}
