package com.test.test04.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {

    @GetMapping("/custom-logout")
    public String logout() {
        SecurityContextHolder.clearContext();
        return "Session Cleared";
    }

}
