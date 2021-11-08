package com.bridgelabz.springaddressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringAddressBookAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAddressBookAppApplication.class, args);
        log.info("Addressbook application started in {} environment", context.getEnvironment().getProperty("environment"));
    }

}
