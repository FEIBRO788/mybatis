package cn.tedu.mybatisdemo.Mapper;

import cn.tedu.mybatisdemo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public List<Student> getStudentAll();
    public int insertStudent();
    public int deleteStudent();
    public int updateStudent();
    public Student getStudentById(long id);
    public List<Student> getListByIds(@Param("min") long min, @Param("max") long max);
    public int addStudent(Student student);
}
