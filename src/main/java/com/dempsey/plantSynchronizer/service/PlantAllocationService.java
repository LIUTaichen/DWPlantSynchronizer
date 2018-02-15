package com.dempsey.plantSynchronizer.service;

import com.dempsey.plantSynchronizer.dao.PlantAllocationRepository;
import com.dempsey.plantSynchronizer.entity.PlantAllocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlantAllocationService {

    private Logger log = LoggerFactory.getLogger(PlantAllocationService.class);

    @Autowired
    private PlantAllocationRepository plantAllocationRepository;

    public List<PlantAllocation> findAll(){
        List<PlantAllocation> resultList = new ArrayList();
         plantAllocationRepository.findAll().forEach(resultList::add);
        resultList.forEach(p -> log.info(p.toString()));

        return resultList;
    }
}
