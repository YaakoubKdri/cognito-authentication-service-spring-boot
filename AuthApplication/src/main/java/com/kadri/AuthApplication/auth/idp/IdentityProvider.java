package com.kadri.AuthApplication.auth.idp;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;

public interface IdentityProvider {
    AuthResponse initiateAuth(AuthRequest request);
}
