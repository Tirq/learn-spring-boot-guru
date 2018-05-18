package com.tirq.springbootguru.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"DEV","default"})
public class DevProfileService implements ProfileService {
    @Override
    public void showProfile() {
        System.out.println("DEV profile!");
    }
}
