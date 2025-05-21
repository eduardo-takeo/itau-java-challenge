package com.itau.itau.exception;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Map;

@Data
@Builder
public class ErrorResponse {
    private int status;
    private String message;
    private OffsetDateTime timestamp;
    private Map<String, String> errors;
}
