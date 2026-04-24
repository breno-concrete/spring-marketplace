package com.breno.marketplace_test.dtos;

public record LoginResponseDTO(
        String token,
        String email,
        String message
) {
    public LoginResponseDTO(String token, String email) {
        this(token, email, "Authentication successful"); // resposta com os dados necessários
    }
}