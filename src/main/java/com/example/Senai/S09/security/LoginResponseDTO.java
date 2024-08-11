package com.example.Senai.S09.security;

public class LoginResponseDTO {
    private String token;
    private Long expiresIn;

    // Construtor
    public LoginResponseDTO(String token, Long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

    // Getters e Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}

