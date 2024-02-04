package com.example.spring_project_onboarding.trainer.repogitory;

import com.example.spring_project_onboarding.trainer.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}
