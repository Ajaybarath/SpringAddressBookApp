package com.bridgelabz.springaddressbookapp.dto;

import lombok.Data;

public @Data
class AddressBookDTO {

    String name;
    String phone;

    public AddressBookDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
