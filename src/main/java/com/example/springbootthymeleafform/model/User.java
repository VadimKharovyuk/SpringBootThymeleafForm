package com.example.springbootthymeleafform.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String name ;
    private String email;
    private String password;
    private String gender;
    private String  profession;
    private boolean married;
    private String note;

}
