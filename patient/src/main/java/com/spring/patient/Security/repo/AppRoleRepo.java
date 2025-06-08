package com.spring.patient.Security.repo;

import com.spring.patient.Security.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<AppRole, Long> {

}
