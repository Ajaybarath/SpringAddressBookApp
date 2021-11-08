package com.bridgelabz.springaddressbookapp.controller;

import com.bridgelabz.springaddressbookapp.dto.AddressBookDTO;
import com.bridgelabz.springaddressbookapp.dto.ResponseDTO;
import com.bridgelabz.springaddressbookapp.implementation.IAddressBookService;
import com.bridgelabz.springaddressbookapp.model.AddressBookData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {



    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping(value = {"/", "", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<AddressBookData> addBookData = null;
        addBookData = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call successful", addBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addBookId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("addBookId") long addBookId) {
        AddressBookData addBookData = addressBookService.getAddressBookDataById((int)addBookId);
        ResponseDTO responseDTO = new ResponseDTO("Get call for id successful", addBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createEmployeePayroll(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addBookData = null;
        addBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created employee payroll dto", addBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{addBookId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayroll(@Valid @PathVariable("addBookId") long addBookId, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addBookData = null;
        addBookData = addressBookService.updateAddressBookData((int)addBookId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated employee payroll dto", addBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addBookId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayroll(@PathVariable("addBookId") long addBookId) {
        addressBookService.deteleAddressBookDataById((int)addBookId);
        ResponseDTO responseDTO = new ResponseDTO("Deleted employee payroll for id ", addBookId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
