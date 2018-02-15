package com.dempsey.plantSynchronizer.dao;

import com.dempsey.plantSynchronizer.entity.PlantAllocation;
import org.springframework.data.repository.CrudRepository;

public interface PlantAllocationRepository extends CrudRepository<PlantAllocation, Integer> {
}
