package com.example.spring_project_onboarding.trainee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TraineeReqDto {
    private String name;
    private String password;
    private String phoneNumber;
    private String image;
}
