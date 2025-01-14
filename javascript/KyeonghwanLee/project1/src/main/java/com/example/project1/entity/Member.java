package com.example.project1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {

    private String id;
    private String pw;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
}