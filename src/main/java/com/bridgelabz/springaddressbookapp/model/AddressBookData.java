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
}
