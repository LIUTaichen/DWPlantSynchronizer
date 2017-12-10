package com.dempsey.plantSynchronizer;

import com.dempsey.plantSynchronizer.service.PlantListAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class PlantSynchronizerApplication implements CommandLineRunner {

	@Autowired
	private PlantListAPIService apiService;


	public static void main(String[] args) {
		SpringApplication.run(PlantSynchronizerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		apiService.syncPlantListWithShirley();
	}
}
