package com.dempsey.plantSynchronizer.dao;

import com.dempsey.plantSynchronizer.entity.ApiRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApiRequestRepository extends CrudRepository<ApiRequest, Integer> {
    List<ApiRequest> findAll();
}
