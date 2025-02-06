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
    @Autowired
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
    public void testInsert() {
        int i = teacherMapper.addTeacher();
        System.out.println(i > 0 ? "修改成功" : "修改失败");
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
    public void testGetStudentAll() {
        List<Student> studentAll = studentMapper.getStudentAll();
        for (Student student : studentAll) {
            System.out.println(student);
        }


    }

    @Test
    public void testInsertStudent() {
        int i = studentMapper.insertStudent();
        System.out.println(i > 0 ? "插入成功" : "插入失败");
    }

    @Test
    public void testDeleteStudent() {
        int i = studentMapper.deleteStudent();
        System.out.println(i > 0 ? "删除成功" : "删除失败");
    }

    @Test
    public void testUpdateStudent() {
        int i = studentMapper.updateStudent();
        System.out.println(i > 0 ? "更新成功" : "更新失败");
    }
    @Test
    public void testSelectStudentById(){
        Student studentById = studentMapper.getStudentById(2);
        System.out.println(studentById);

    }
    @Test
    public void testGetListByIds(){
        List<Student> listByIds = studentMapper.getListByIds(1, 3);
        for (Student student:listByIds){
            System.out.println(student);
        }
    }
    @Test
    public void testAddStudent(){
        Student student = new Student();
        student.setId(8888);
        student.setName("沙和尚");
        student.setAge(2800);
        student.setGender("男");
        student.setJob("搬家大队长");
        student.setBirth(null);
        student.setLocationId(0);
        student.setTeamLeader(0);
        student.setClassId(0);
        int rows = studentMapper.addStudent(student);
        System.out.println(rows > 0 ? "新增成功!" : "新增失败!");
    }

}
