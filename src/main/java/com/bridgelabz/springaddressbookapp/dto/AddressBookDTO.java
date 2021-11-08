package com.bridgelabz.springaddressbookapp.dto;

public class AddressBookDTO {

    String name;
    String phone;

    public AddressBookDTO() {
    }

    public AddressBookDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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
