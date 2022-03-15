package dev.niangfils.rhemployement.domain;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class DevResponse {
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String message;
    private String reason;
}
