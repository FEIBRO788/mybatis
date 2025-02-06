package cn.tedu.mybatisdemo;

import cn.tedu.mybatisdemo.Mapper.StudentMapper;
import cn.tedu.mybatisdemo.Mapper.TeacherMapper;
import cn.tedu.mybatisdemo.pojo.Student;
import cn.tedu.mybatisdemo.pojo.teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    TeacherMapper teacherMapper;
    private StudentMapper studentMapper;


    //测试mybatis
    @Test
    public void testSelectAll() {
        List<teacher> teacherAll = teacherMapper.getTeacherAll();
        for (teacher teacher : teacherAll) {
            System.out.println(teacher);
        }
    }
    @Test
    public void testInsert(){
        int i = teacherMapper.addTeacher();
        System.out.println(i>0?"修改成功":"修改失败");
    }
    @Test
    public void testUpdateLocations() {
        int rows = teacherMapper.update();
        System.out.println(rows > 0 ? "修改成功!" : "修改失败!!");
    }

    @Test
    public void testDeleteLocations() {
        int rows = teacherMapper.delete();
        System.out.println(rows > 0 ? "删除成功!" : "删除失败!!");
    }


    @Test
    public void testGetStudentAll(){
        List<Student> studentAll = studentMapper.getStudentAll();
        for (Student student:studentAll){
            System.out.println(student);
        }


    }

}
