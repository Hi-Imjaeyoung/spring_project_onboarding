package com.example.spring_project_onboarding.trainee.domain;

import com.example.spring_project_onboarding.trainer.domain.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String phoneNumber;
    private String image;
    @Builder.Default
    private String delYn="N";

    @CreationTimestamp
    private LocalDateTime createTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Trainer trainer;

    public void updateTainee(String name, String password, String phoneNumber, String image) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.image = image;
    }
    public void deleteTainee() {
        this.delYn = "Y";
    }
}
