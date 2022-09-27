package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private String firstName;
    private String lastName;

    //Thymeleaf returns yyyy-mm-dd, but LocalDate accepts mm-dd-yyyy, we have to use annotation to fix the changes
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
