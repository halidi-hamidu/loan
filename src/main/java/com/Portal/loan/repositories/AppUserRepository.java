package com.Portal.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Portal.loan.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByEmail(String email);
}