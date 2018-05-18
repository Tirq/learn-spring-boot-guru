package com.tirq.springbootguru.controller;

import com.tirq.springbootguru.service.ProfileService;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {

    ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    public void showProfile() {
        profileService.showProfile();
    }
}
