package com.huaqi.demo.test;

import com.huaqi.demo.service.UploadCSVFile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author kwhua
 * @Date 2021/4/8 22:17
 */
@SpringBootTest
public class UploadCSVTest {
    @Autowired
    private UploadCSVFile uploadCSVFile;
    @Test
    public void Upload(){
        uploadCSVFile.upload("20210408");
    }
}
