package com.example.instantRamenHub.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// using annotation (@Data)here since we use lombok, which means we do not need to make constructors, getters and setters.
// since lombok does it for us (remove boilerplate code)....
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
