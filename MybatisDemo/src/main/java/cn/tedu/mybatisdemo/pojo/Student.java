package cn.tedu.mybatisdemo.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String job;
    private String birth;
    private Integer locationId;
    private Integer teamLeader;
    private Integer classId;
}