package com.kadri.AuthApplication.security;

import jakarta.security.auth.message.AuthException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtTokenValidator {
    public Authentication validate(String token) throws AuthException {
        if(!"valid-token".equals(token)){
            throw new AuthException("Invalid JWT token");
        }

        String username = "demo-user";
        List<GrantedAuthority> authorities =
                List.of(new SimpleGrantedAuthority("ROLE_USER"));
        return new UsernamePasswordAuthenticationToken(
                username,
                null,
                authorities
        );
    }
}
