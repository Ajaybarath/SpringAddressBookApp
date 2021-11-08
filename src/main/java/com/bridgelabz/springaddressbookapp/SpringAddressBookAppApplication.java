package com.bridgelabz.springaddressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringAddressBookAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAddressBookAppApplication.class, args);
        log.info("Addressbook application started");
    }

}
