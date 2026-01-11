package com.kadri.AuthApplication.auth.service;

import com.kadri.AuthApplication.auth.idp.IdentityProvider;
import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final IdentityProvider identityProvider;

    public AuthService(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

    public AuthResponse login(AuthRequest request){
        return identityProvider.initiateAuth(request);
    }
}
