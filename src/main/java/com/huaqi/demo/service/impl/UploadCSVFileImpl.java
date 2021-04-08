package com.huaqi.demo.service.impl;

import com.huaqi.demo.entity.User;
import com.huaqi.demo.service.UploadCSVFile;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author kwhua
 * @Date 2021/4/8 21:51
 */
@Service
public class UploadCSVFileImpl implements UploadCSVFile {

    private final Logger logger = LoggerFactory.getLogger(UploadCSVFile.class);
    final String path = "D:\\app\\data";
    @Override
    public void upload(String begDate) {
        logger.info("生成CSV文件开始");
        //构建两个对象
        List<User> list = new ArrayList<>();
        list.add(new User("001","小明","男",18));
        list.add(new User("002","小红","女",16));
        File csvPath = new File(path);
        if (!csvPath.exists()){
            csvPath.mkdirs();
        }
        String file_name =  new StringBuffer().append(File.separator).append("AWARD").append(begDate).append(".csv").toString();
        file_name = new String(file_name.getBytes(), StandardCharsets.UTF_8);
        File file = new File(path + file_name);
        CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("ID","姓名","性别","年龄");
        //使用这种方式，在执行完之后自动关闭流，省略了手动关流的操作。
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file),StandardCharsets.UTF_8)){
            toCsv(list,csvFormat,osw);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成CSV文件
     * @param UserList
     * @param csvFormat
     * @param osw
     * @throws IOException
     */
    private void toCsv(List<User> UserList, CSVFormat csvFormat, OutputStreamWriter osw) throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter(osw, csvFormat);
        for (User user : UserList) {
            csvPrinter.printRecord(user.getId()
                    ,user.getName()
                    ,user.getSex()
                    ,user.getAge());

        }
        csvPrinter.flush();
        csvPrinter.close();
    }
}
