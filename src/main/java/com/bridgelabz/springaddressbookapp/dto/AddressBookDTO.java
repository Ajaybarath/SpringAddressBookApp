package com.bridgelabz.springaddressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;

public @Data
class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Name is Invalid")
    String name;

    @Pattern(regexp = "^([+]?([0-9]{2})?([6-9]{1}[0-9]{9}))$", message = "Phone number is Invalid")
    String phone;

    String address;
    String city;
    String zip;
    String state;


    public AddressBookDTO(String name, String phone, String address, String city, String zip, String state) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
