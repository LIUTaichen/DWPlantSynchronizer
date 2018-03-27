package com.dempsey.plantSynchronizer;

import com.dempsey.plantSynchronizer.dao.ApiRequestRepository;
import com.dempsey.plantSynchronizer.dao.NimbusCivilPlantRepository;
import com.dempsey.plantSynchronizer.entity.ApiRequest;
import com.dempsey.plantSynchronizer.entity.NimbusCivilPlant;
import com.dempsey.plantSynchronizer.service.PlantAllocationService;
import com.dempsey.plantSynchronizer.service.PlantListAPIForNimbusService;
import com.dempsey.plantSynchronizer.service.PlantListAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PlantSynchronizerApplication  implements CommandLineRunner{

	private Logger log = LoggerFactory.getLogger(PlantSynchronizerApplication.class);
	@Autowired
	private PlantListAPIForNimbusService apiService;

	@Autowired
	private ApiRequestRepository apiRequestRepository;


	public static void main(String[] args) {
		SpringApplication.run(PlantSynchronizerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		apiService.updatePlantLocation();

	}
}
