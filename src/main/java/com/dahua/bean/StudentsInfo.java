package com.dahua.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class StudentsInfo {
    private Integer id;
    private String name;
    private Boolean isPass;
    private List<ScoreInfoBean> scoreInfo;
}
