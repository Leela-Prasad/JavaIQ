package com.test.test04.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LogoutController {

    @GetMapping("/custom-logout")
    public String logout(HttpSession session) {
        session.invalidate();
        SecurityContextHolder.clearContext();
        return "Session Cleared";
    }

}
