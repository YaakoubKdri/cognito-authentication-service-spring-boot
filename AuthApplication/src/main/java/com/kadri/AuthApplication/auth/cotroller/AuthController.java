package com.kadri.AuthApplication.auth.cotroller;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import com.kadri.AuthApplication.auth.model.ChallengeResponse;
import com.kadri.AuthApplication.auth.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/challenge")
    public ResponseEntity<AuthResponse> respondToChallenge(@RequestBody ChallengeResponse challengeResponse){
        return ResponseEntity.ok(authService.respondToChallenge(challengeResponse));
    }
    @PostMapping("/refresh")
    public ResponseEntity<AuthResponse> refresh(){
        return ResponseEntity.ok(authService.refresh());
    }
}
