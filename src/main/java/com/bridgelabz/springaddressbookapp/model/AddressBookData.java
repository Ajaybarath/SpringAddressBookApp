package com.bridgelabz.springaddressbookapp.model;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;
import lombok.Data;

public @Data
class AddressBookData {

    int id;
    String name;
    String phone;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.name = addressBookDTO.getName();
        this.phone = addressBookDTO.getPhone();
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
