package com.example.spring_project_onboarding.Trainer.service;

import com.example.spring_project_onboarding.Trainer.domain.Trainer;
import com.example.spring_project_onboarding.Trainer.dto.TrainerCreateReqDto;
import com.example.spring_project_onboarding.Trainer.repogitory.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TrainerService {
    private final TrainerRepository trainerRepository;
    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public void Save(TrainerCreateReqDto trainerCreateReqDto) {
        Trainer trainer = Trainer.builder()
                .name(trainerCreateReqDto.getName())
                .email(trainerCreateReqDto.getEmail())
                .phoneNumber(trainerCreateReqDto.getPhoneNumber())
                .career(trainerCreateReqDto.getCareer())
                .build();
        trainerRepository.save(trainer);
    }
}
