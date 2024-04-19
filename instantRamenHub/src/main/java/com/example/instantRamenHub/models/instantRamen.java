package com.example.instantRamenHub.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// using annotation here sice we use lombok, which mean i do not need to to make constructors, getters and setters.
// since that in the lombok....
@Data
@Document
public class instantRamen {
    @Id
    private  String id;
    private String name;
    private String flavor;
    private typeOfNoodle typeOfNoodle;
    private String country;
    private String producer;
    private String picURL;
}
