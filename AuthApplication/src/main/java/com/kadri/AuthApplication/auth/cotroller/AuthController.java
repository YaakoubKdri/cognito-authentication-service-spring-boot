package com.kadri.AuthApplication.auth.cotroller;

import com.kadri.AuthApplication.auth.model.AuthRequest;
import com.kadri.AuthApplication.auth.model.AuthResponse;
import com.kadri.AuthApplication.auth.model.ChallengeResponse;
import com.kadri.AuthApplication.auth.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(){
        authService.logout();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/me")
    public ResponseEntity<String> me(){
        return ResponseEntity.ok("Authenticated user");
    }
}
