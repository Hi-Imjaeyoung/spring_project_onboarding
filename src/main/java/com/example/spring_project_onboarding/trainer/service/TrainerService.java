package com.example.spring_project_onboarding.trainer.service;

import com.example.spring_project_onboarding.trainer.domain.Trainer;
import com.example.spring_project_onboarding.trainer.dto.TrainerCreateReqDto;
import com.example.spring_project_onboarding.trainer.dto.TrainerReqDto;
import com.example.spring_project_onboarding.trainer.repogitory.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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
                .password(trainerCreateReqDto.getPassword())
                .phoneNumber(trainerCreateReqDto.getPhoneNumber())
                .career(trainerCreateReqDto.getCareer())
                .build();
        trainerRepository.save(trainer);
    }
    public Trainer Update(Long id, TrainerReqDto trainerReqDto) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("not found trainer"));
        trainer.updateTainer(
                trainerReqDto.getName(),
                trainerReqDto.getPassword(),
                trainerReqDto.getPhoneNumber(),
                trainerReqDto.getCareer(),
                trainerReqDto.getImage());
        return trainer;
    }
    public Trainer Delete(Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(("not found trainer")));
        trainer.deleteTainer();
        return trainer;
    }
}
