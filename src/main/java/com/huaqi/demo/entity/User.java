package com.huaqi.demo.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @Author kwhua
 * @Date 2021/4/8 23:09
 */
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class User implements Serializable{
    private String id;
    private String name;
    private String sex;
    private Integer age;
}
