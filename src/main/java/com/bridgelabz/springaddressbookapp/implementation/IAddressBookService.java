package com.bridgelabz.springaddressbookapp.implementation;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapp.model.AddressBookData;

import javax.validation.Valid;
import java.util.List;

public interface IAddressBookService {
    public List<AddressBookData> getAddressBookData();

    public AddressBookData getAddressBookDataById(int addBookId);

    void deteleAddressBookDataById(int addBookId);

    AddressBookData createAddressBookData(@Valid AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int addBookId, AddressBookDTO addressBookDTO);
}
