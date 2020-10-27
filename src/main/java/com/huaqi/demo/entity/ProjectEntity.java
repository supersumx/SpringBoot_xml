package com.huaqi.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author kwhua
 * @Date 2020/10/26 14:17
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEntity implements Serializable {
    private Integer id;
    private String projectName;
    private String justification;
    /**
     * 1 表示open 0 表示close
     */
    private Integer positions;
    private String projectLeader;
    private String unit1;
    private String team1;
    private String projectMember2;
    private String unit2;
    private String team2;
    private String projectMember3;
    private String unit3;
    private String team3;
    private String projectMember4;
    private String unit4;
    private String team4;
    private String projectMember5;
    private String unit5;
    private String team5;

}
