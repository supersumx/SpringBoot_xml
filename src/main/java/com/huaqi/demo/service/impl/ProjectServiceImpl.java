package com.huaqi.demo.service.impl;

import com.huaqi.demo.dao.ProjectDao;
import com.huaqi.demo.entity.ProjectEntity;
import com.huaqi.demo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:17
 */
@Service
public class ProjectServiceImpl implements ProjectService {
@Autowired
private ProjectDao projectDao;
    @Override
    public ProjectEntity getProjectById(Integer id) {
        return projectDao.getProjectById(id);
    }

    @Override
    public int create(ProjectEntity projectEntity) {
        return projectDao.create(projectEntity);
    }

    @Override
    public List<ProjectEntity> findAll() {
        return projectDao.findAll();
    }

    @Override
    public void update(ProjectEntity projectEntity) {
        projectDao.update(projectEntity);
    }

    @Override
    public void delete(Integer id) {
        projectDao.delete(id);
    }
}
