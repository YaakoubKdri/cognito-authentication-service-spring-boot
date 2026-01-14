package com.kadri.AuthApplication.auth.idp;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import com.kadri.AuthApplication.auth.model.ChallengeResponse;
import org.springframework.stereotype.Component;

@Component
public class MockIdentityProvider implements IdentityProvider{
    @Override
    public AuthResponse initiateAuth(AuthRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public AuthResponse respondToChallenge(ChallengeResponse challengeResponse) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public AuthResponse refresh() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
