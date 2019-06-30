package com.dahua.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Info {
    private String className;
    private List<StudentsInfo> studensInfo;
}
