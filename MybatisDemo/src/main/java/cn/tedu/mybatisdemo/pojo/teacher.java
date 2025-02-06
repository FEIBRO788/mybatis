package cn.tedu.mybatisdemo.pojo;

import lombok.Data;

@Data//代替get，set，tostring
public class teacher {
    private Integer id;
    private String name;
    private Integer age;
    private String title;
    private Integer manager;
    private Integer salary;
    private Integer comm;
    private String gender;
    private Integer subjectId;
}
