package com.spring.patient.Security.service;

import com.spring.patient.Security.Entities.AppRole;
import com.spring.patient.Security.Entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);

    AppRole addNewRole(String role);

    void removeRoleFromUser(String username, String role);
}
