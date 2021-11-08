package com.bridgelabz.springaddressbookapp.service;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapp.implementation.IAddressBookService;
import com.bridgelabz.springaddressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addBookId) {
        return addressBookDataList.stream()
                .filter(addressBookData -> addressBookData.getId() == addBookId)
                .findFirst()
                .orElseThrow(null);
    }

    @Override
    public void deteleAddressBookDataById(int addBookId) {
        addressBookDataList.removeIf(add -> add.getId() == addBookId);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size()+1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addBookId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(addBookId);
        addressBookData.setName(addressBookDTO.getName());
        addressBookData.setPhone(addressBookDTO.getPhone());
        return addressBookData;
    }
}
