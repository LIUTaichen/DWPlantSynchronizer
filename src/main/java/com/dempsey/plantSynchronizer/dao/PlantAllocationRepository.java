package com.dempsey.plantSynchronizer.dao;

import com.dempsey.plantSynchronizer.entity.Plant;
import com.dempsey.plantSynchronizer.entity.PlantAllocation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantAllocationRepository extends CrudRepository<PlantAllocation, Integer> {
    List<PlantAllocation> findAllByPlantIDAndActive(Integer plantId, boolean b);
}
