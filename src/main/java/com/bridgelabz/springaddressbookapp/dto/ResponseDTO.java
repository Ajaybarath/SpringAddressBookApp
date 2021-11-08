package com.bridgelabz.springaddressbookapp.dto;

public class ResponseDTO {

    String message;
    Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
