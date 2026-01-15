package com.kadri.AuthApplication.auth.idp;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import com.kadri.AuthApplication.auth.model.ChallengeResponse;

public interface IdentityProvider {
    AuthResponse initiateAuth(AuthRequest request);

    AuthResponse respondToChallenge(ChallengeResponse challengeResponse);

    AuthResponse refresh();

    void logout();
}
