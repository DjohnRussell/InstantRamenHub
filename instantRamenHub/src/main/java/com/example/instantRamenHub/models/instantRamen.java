package com.example.instantRamenHub.models;

import lombok.Data;

// using annotation here sice we use lombok, which mean i do not need to to make constructors, getters and setters.
// since that in the lombok....
@Data
public class instantRamen {
    private String name;
    private String flavor;
    private typeOfNoodle typeOfNoodle;
    private String country;
    private String producer;
    private String picURL;
}
