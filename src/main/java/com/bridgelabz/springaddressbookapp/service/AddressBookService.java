package com.bridgelabz.springaddressbookapp.service;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapp.exception.AddressBookException;
import com.bridgelabz.springaddressbookapp.implementation.IAddressBookService;
import com.bridgelabz.springaddressbookapp.model.AddressBookData;
import com.bridgelabz.springaddressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Autowired
    AddressBookRepository addressBookRepository;

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int addBookId) {
        return addressBookRepository
               .findById(addBookId)
                .orElseThrow(() -> new AddressBookException("Address book id not found"));
    }

    @Override
    public void deteleAddressBookDataById(int addBookId) {
        AddressBookData addressBookData = this.getAddressBookDataById(addBookId);
        addressBookRepository.delete(addressBookData);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int addBookId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(addBookId);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }
}
