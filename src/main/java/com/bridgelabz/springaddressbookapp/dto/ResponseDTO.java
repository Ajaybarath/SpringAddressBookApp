package com.bridgelabz.springaddressbookapp.dto;

import lombok.Data;

public @Data
class ResponseDTO {

    String message;
    Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
