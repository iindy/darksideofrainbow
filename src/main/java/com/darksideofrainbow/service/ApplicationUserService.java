package com.darksideofrainbow.service;

import com.darksideofrainbow.models.ApplicationUser;

import java.util.List;

public interface ApplicationUserService {
    Boolean create(ApplicationUser user);
    ApplicationUser findOne(Long id);
    ApplicationUser edit(Long id, String username, Boolean isAdmin);
    List<ApplicationUser> findAll();
    ApplicationUser findByUserName(String username);
    Boolean delete(Long id);
}
