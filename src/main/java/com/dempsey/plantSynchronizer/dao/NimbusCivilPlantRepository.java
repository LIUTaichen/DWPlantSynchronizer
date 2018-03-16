package com.dempsey.plantSynchronizer.dao;

import com.dempsey.plantSynchronizer.entity.NimbusCivilPlant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface NimbusCivilPlantRepository extends CrudRepository<NimbusCivilPlant, Integer> {
    List<NimbusCivilPlant> findByFleetIdIsNotNullAndFleetIdIn(Set<String> fleetIdSet);
    List<NimbusCivilPlant> findByFleetIdIsNotNull();

}
