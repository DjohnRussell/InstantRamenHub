package com.example.instantRamenHub;

import com.example.instantRamenHub.models.instantRamen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RamenRepository extends MongoRepository
        <instantRamen, String> {

}
