package com.huaqi.demo.dao;

import com.huaqi.demo.entity.ProjectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:17
 */
@Mapper
public interface ProjectDao {
    ProjectEntity getProjectById(Integer id);

    int create(ProjectEntity projectEntity);

    List<ProjectEntity> findAll();

    void update(ProjectEntity projectEntity);

    void delete(Integer id);
}
