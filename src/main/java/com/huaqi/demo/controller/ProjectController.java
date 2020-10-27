package com.huaqi.demo.controller;

import com.huaqi.demo.entity.ProjectEntity;
import com.huaqi.demo.service.ProjectService;
import com.huaqi.demo.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:16
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    /**
     * 根据id查找一个项目
     * @param id
     */
    @GetMapping(value = "/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Integer id){
        ProjectEntity projectEntity = projectService.getProjectById(id);
        log.info(projectEntity.toString());
        return CommonResult.succ(projectEntity);
    }

    /**
     * 查询所有项目
     * @return
     */
    @GetMapping("/findAll")
    public CommonResult findAll(){
        List<ProjectEntity> projectList = projectService.findAll();
        return CommonResult.succ(projectList);
    }

    /**
     * 插入一个项目实体
     * @param projectEntity
     */
    @PostMapping(value = "/create")
    public CommonResult create (@RequestBody ProjectEntity projectEntity){
        int result =  projectService.create(projectEntity);
        log.info("插入结果"+result);
        if (result>0){
            return  CommonResult.succ(result+"插入成功");
        } else {
            return CommonResult.fail("插入失败");
        }
    }
    /**
     * 修改项目内容
     */
    @PostMapping(value = "/update")
    public CommonResult update(@RequestBody ProjectEntity projectEntity){
        projectService.update(projectEntity);
        return CommonResult.succ("ok");
    }

    /**
     * 删除一条记录
     */
    @RequestMapping(value = "/delete")
    public CommonResult delete(@RequestParam Integer id){
        projectService.delete(id);
        return CommonResult.succ("删除成功");
    }

    @GetMapping("/abc")
    public String hello(Model model){
        ProjectEntity projectEntity = projectService.getProjectById(1);
        model.addAttribute("msg",projectEntity);
        log.info(projectEntity.toString());
        return "success";
    }
}
