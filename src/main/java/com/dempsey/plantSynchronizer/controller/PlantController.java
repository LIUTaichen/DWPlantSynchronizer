package com.dempsey.plantSynchronizer.controller;

import com.dempsey.plantSynchronizer.dao.PlantRepository;
import com.dempsey.plantSynchronizer.entity.Plant;
import com.dempsey.plantSynchronizer.service.PlantListAPIService;
import com.dempsey.plantSynchronizer.service.PlantService;
import com.dempsey.plantSynchronizer.util.PlantsUtil;
import com.dempsey.plantSynchronizer.util.SheetAPIUtil;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class PlantController {

    private Logger log = LoggerFactory.getLogger(PlantController.class);

    @Autowired
    private PlantRepository plantRepository;

    @Autowired
    private PlantListAPIService apiService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @Transactional
    public @ResponseBody
    String updatePlants() {
        apiService.syncPlantListWithShirley();
        return "done";
    }


}
