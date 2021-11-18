package com.bridgelabz.springaddressbookapp.model;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "address_book")
public @Data @ToString
class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressBook_id")
    int id;

    String name;
    String phone;
    String address;
    String city;
    String zip;
    String state;

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.name = addressBookDTO.getName();
        this.phone = addressBookDTO.getPhone();
        this.state = addressBookDTO.getState();
        this.city = addressBookDTO.getCity();
        this.address = addressBookDTO.getAddress();
        this.zip = addressBookDTO.getZip();
    }

    public AddressBookData() {

    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.name = addressBookDTO.getName();
        this.phone = addressBookDTO.getPhone();
        this.state = addressBookDTO.getState();
        this.city = addressBookDTO.getCity();
        this.address = addressBookDTO.getAddress();
        this.zip = addressBookDTO.getZip();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
