package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

  //  @NotNull ---> field shouldn't be null'
  //  @NotEmpty ---> field shouldn't be an empty string ""
   // @NotBlank ---> filed shouldn't be blank "           "
    // @NotNull->@NotNull
    //@NotEmpty->@NotNull +@NotEmpty
    //@NotBlank->@NotNull+@NullEmpty+@NotBlank
    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    @NotBlank
    @Size(max=12, min=2)
    private String lastName;

    //Thymeleaf returns yyyy-mm-dd (LocalDate returns mm-dd-yyyy)
    @NotNull// you can use with any kind of object as LocalDate is not a String
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
@NotBlank
@Email
    private String email;
//@NotBlank
//@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
