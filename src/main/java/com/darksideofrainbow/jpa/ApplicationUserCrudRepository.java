package com.darksideofrainbow.jpa;

import com.darksideofrainbow.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationUserCrudRepository extends CrudRepository<ApplicationUser, Long> {
    List<ApplicationUser> findByUsernameAllIgnoreCase(String username);
}