package com.kadri.AuthApplication.auth.model;

import jakarta.validation.constraints.NotBlank;

public class AuthRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
