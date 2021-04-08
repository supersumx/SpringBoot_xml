package com.huaqi.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kwhua
 * @Date 2021/4/8 21:46
 */
@RestController
@RequestMapping("/api")
public class TestCSVController {
    @RequestMapping("/uploadCSVFile")
    public void uploadCSVFile(){

    }

    @RequestMapping("/downCSVFile")
    public void downCSVFile(){

    }
}
