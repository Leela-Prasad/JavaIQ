package com.test.test04.config;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if(authentication.getName().equals("leela") && authentication.getCredentials().equals("pass")) {
            var authorities = List.of(
                    new SimpleGrantedAuthority("ROLE_VIEWER"),
                    new SimpleGrantedAuthority("ROLE_EDITOR")
            );
            return new CustomAuthenticationToken(authentication.getName(), authentication.getCredentials(), authorities);
        }

        throw new RuntimeException("Bad Credentials");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(CustomAuthenticationToken.class);
    }

}
