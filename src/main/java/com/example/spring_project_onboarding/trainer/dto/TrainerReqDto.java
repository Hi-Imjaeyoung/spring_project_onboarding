package com.example.spring_project_onboarding.trainer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TrainerReqDto {
    private String name;
    private String password;
    private String phoneNumber;
    private String career;
    private String image;
}
