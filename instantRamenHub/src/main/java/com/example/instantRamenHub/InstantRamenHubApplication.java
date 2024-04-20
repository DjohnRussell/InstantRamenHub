package com.example.instantRamenHub;

import com.example.instantRamenHub.models.instantRamen;
import com.example.instantRamenHub.models.typeOfNoodle;
import com.mongodb.annotations.Beta;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstantRamenHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstantRamenHubApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RamenRepository ramenRepository) {
		return args -> {
			instantRamen instantRamen = new instantRamen(
					//---------Samyang Buldak------------

				"Samyang Buldak",
					"Hot Chicken",
					typeOfNoodle.RamenNoodles,
					"South Korea",
					"Samyang Foods",
					"https://www.cooperscandy.no/cache/f9/700x700-prod_30670.jpeg"
			);

			ramenRepository.insert(instantRamen);
		};
	}
}
 