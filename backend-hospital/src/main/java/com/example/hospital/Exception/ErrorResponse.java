package com.example.hospital.Exception;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {

    private String error;
    private List<String> details = new ArrayList<>();
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public List<String> getDetails() {
        return details;
    }
    public void setDetails(List<String> details) {
        this.details = details;
    }
}
