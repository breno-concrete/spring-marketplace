package com.breno.marketplace_test.dtos;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

public record ErrorResponseDTO(
        String error,
        String message,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime timestamp
) {}