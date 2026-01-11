package com.kadri.AuthApplication.auth.idp;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import org.springframework.stereotype.Component;

@Component
public class MockIdentityProvider implements IdentityProvider{
    @Override
    public AuthResponse initiateAuth(AuthRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
