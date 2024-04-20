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

    public instantRamen(String name, String flavor, com.example.instantRamenHub.models.typeOfNoodle typeOfNoodle, String country, String producer, String picURL) {
        this.name = name;
        this.flavor = flavor;
        this.typeOfNoodle = typeOfNoodle;
        this.country = country;
        this.producer = producer;
        this.picURL = picURL;
    }
}
