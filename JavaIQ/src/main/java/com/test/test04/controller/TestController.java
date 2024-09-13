package com.test.test04.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasAuthority('ROLE_EDITOR')")
    @GetMapping("/test")
    public String test() {
        return "Test Controller Executed";
    }
}
