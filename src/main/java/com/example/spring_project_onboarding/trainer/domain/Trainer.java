package com.example.spring_project_onboarding.trainer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String career;
    private String phoneNumber;
    private String image;
    @Builder.Default
    private String delYn="N";

    @OneToMany(mappedBy = "trainer")
    private List<Trainer> trainers;

    @CreationTimestamp
    private LocalDateTime createTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;

    public void updateTainer(String name, String password, String phoneNumber, String career, String image) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.career = career;
        this.image = image;
    }

    public void deleteTainer() {
        this.delYn = "Y";
    }
}
