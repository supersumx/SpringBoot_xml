package com.huaqi.demo.service;

import com.huaqi.demo.entity.ProjectEntity;

import java.util.List;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:16
 */
public interface ProjectService {
    ProjectEntity getProjectById(Integer id);
    int create(ProjectEntity projectEntity);

    List<ProjectEntity> findAll();

    void update(ProjectEntity projectEntity);

    void delete(Integer id);
}
