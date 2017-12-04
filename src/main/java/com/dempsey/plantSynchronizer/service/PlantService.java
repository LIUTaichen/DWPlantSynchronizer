package com.dempsey.plantSynchronizer.service;

import com.dempsey.plantSynchronizer.dao.PlantRepository;
import com.dempsey.plantSynchronizer.entity.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public List<Plant> getPlantsWith(){
        List<Plant> plantList;
        //plantList = new ArrayList<Plant> (plantRepository.findByFleetIdIsNotNullAndActiveTrue());
        return null;
    }
}
