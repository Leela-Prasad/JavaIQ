package com.test.test03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test03Controller {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/unsecured/hash")
    public String hash() {
        String hashedPassword = passwordEncoder.encode("Secret Password");
        return hashedPassword;
    }

    @GetMapping("/unsecured/match")
    public boolean match(@RequestParam("password") String password) {
//        Verification
        return passwordEncoder.matches(password, passwordEncoder.encode("Secret Password"));
    }
}
