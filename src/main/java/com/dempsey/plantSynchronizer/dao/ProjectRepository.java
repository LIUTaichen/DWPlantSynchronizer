package com.dempsey.plantSynchronizer.dao;

import com.dempsey.plantSynchronizer.entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
