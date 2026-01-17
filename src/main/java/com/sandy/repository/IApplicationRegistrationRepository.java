package com.sandy.repository;

import com.sandy.entity.CitizenAppRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IApplicationRegistrationRepository extends JpaRepository<CitizenAppRegistrationEntity,Integer> {
}
