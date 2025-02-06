package cn.tedu.mybatisdemo.Mapper;

import cn.tedu.mybatisdemo.pojo.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudentAll();
    public int insertStudent();
    public int deleteStudent();
    public int updateStudent();
    public Student getStudentById(long id);
    public List<Student> getListByIds(long min ,long max);
    public int addStudent(Student student);
}
