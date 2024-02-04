package com.example.spring_project_onboarding.trainer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TrainerCreateReqDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String career;


}
