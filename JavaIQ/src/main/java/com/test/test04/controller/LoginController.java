package com.test.test04.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.test04.config.CustomAuthenticationProvider;
import com.test.test04.config.CustomAuthenticationToken;
import com.test.test04.model.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CustomAuthenticationProvider authenticationProvider;

    @PostMapping("/login")
    public void login(@RequestBody String payload) throws Exception {
        Auth auth = objectMapper.readValue(payload, Auth.class);
        CustomAuthenticationToken authenticationToken = new CustomAuthenticationToken(auth.getUsername(), auth.getPassword());

        Authentication authentication = authenticationProvider.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        System.out.println("Login Successful");
    }
}
