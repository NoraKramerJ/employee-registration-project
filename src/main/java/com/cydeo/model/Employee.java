package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    private String lastName;

    //Thymeleaf returns yyyy-mm-dd (LocalDate returns mm-dd-yyyy)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
