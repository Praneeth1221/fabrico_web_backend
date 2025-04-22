package edu.icet.fabrico_web_backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorException {
    private  String status;
    private  String message;
}
