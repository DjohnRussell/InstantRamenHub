package com.example.instantRamenHub;

import com.example.instantRamenHub.models.instantRamen;
import com.example.instantRamenHub.models.typeOfNoodle;
import com.example.instantRamenHub.repositorys.RamenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.Query;

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

			instantRamen instantRamen1 = new instantRamen(
					"Samyang Buldak",
					"Hot Chicken Cheese",
					typeOfNoodle.EggNoodles,
					"Samyang Foods",
					"Samyang Foods",
					"https://www.google.com/imgres?q=samyang%20nudler&imgurl=https%3A%2F%2Fwww.nudlekongen." +
							"no%2Fshop123varer%2Fbilder%2Fimage_4615.jpg&imgrefurl=https%3A%2F%2Fwww.nudlekongen." +
							"no%2Fproductdetails.php%3Fproduct%3D4615&docid=BeiaVZ3Kgv-BiM&tbnid=b64URjfXYmcvWM&vet=" +
							"12ahUKEwi8vPKw3tGFAxUmLhAIHfowBEEQM3oECBgQAA." +
							".i&w=663&h=561&hcb=2&ved=2ahUKEwi8vPKw3tGFAxUmLhAIHfowBEEQM3oECBgQAA"

			);
			ramenRepository.insert(instantRamen1);
		};
	}
}
 