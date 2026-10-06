package com.spring.springboot.task9springboot.Exception;

import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private Object details;

    public ErrorDetails(LocalDateTime timestamp, int status, String error, Object details) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.details = details;
    }

    // Getters
    public LocalDateTime getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getError() { return error; }
    public Object getDetails() { return details; }
}