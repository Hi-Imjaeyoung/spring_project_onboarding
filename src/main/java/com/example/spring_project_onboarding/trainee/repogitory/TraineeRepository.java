package com.example.spring_project_onboarding.trainee.repogitory;

import com.example.spring_project_onboarding.trainee.domain.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long> {

}
