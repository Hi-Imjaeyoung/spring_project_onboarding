package com.example.spring_project_onboarding.trainee.service;

import com.example.spring_project_onboarding.trainee.domain.Trainee;
import com.example.spring_project_onboarding.trainee.dto.TraineeCreateReqDto;
import com.example.spring_project_onboarding.trainee.dto.TraineeReqDto;
import com.example.spring_project_onboarding.trainee.repogitory.TraineeRepository;
import com.example.spring_project_onboarding.trainer.domain.Trainer;
import com.example.spring_project_onboarding.trainer.dto.TrainerReqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class TraineeService {
    private final TraineeRepository traineeRepository;
    @Autowired
    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public void Save(TraineeCreateReqDto traineeCreateReqDto) {
        Trainee trainee = Trainee.builder()
                .name(traineeCreateReqDto.getName())
                .email(traineeCreateReqDto.getEmail())
                .password(traineeCreateReqDto.getPassword())
                .phoneNumber(traineeCreateReqDto.getPhoneNumber())
                .build();
        traineeRepository.save(trainee);
    }
    public Trainee Update(Long id, TraineeReqDto traineeReqDto) {
        Trainee trainee = traineeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("not found trainee"));
        trainee.updateTainer(
                traineeReqDto.getName(),
                traineeReqDto.getPassword(),
                traineeReqDto.getPhoneNumber(),
                traineeReqDto.getImage());
        return trainee;
    }
}
