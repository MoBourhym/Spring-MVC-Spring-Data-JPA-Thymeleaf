package com.spring.patient.Security.service;

import com.spring.patient.Security.Entities.AppRole;
import com.spring.patient.Security.Entities.AppUser;
import groovy.transform.Sealed;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Override
    public AppUser addNewUser(String username, String password, String email, String confirmPassword) {
        return null;
    }

    @Override
    public AppRole addNewRole(String role) {
        return null;
    }

    @Override
    public void removeRoleFromUser(String username, String role) {


    }
}
