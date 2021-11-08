package com.bridgelabz.springaddressbookapp.model;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;

public class AddressBookData {

    int id;
    String name;
    String phone;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.name = addressBookDTO.getName();
        this.phone = addressBookDTO.getPhone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "AddressBookData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
