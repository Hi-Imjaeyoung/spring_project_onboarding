package com.example.spring_project_onboarding.trainee.service;

import com.example.spring_project_onboarding.trainee.domain.Trainee;
import com.example.spring_project_onboarding.trainee.dto.TraineeCreateReqDto;
import com.example.spring_project_onboarding.trainee.repogitory.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                .phoneNumber(traineeCreateReqDto.getPhoneNumber())
                .build();
        traineeRepository.save(trainee);
    }
}
