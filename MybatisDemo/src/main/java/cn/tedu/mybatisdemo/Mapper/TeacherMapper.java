package cn.tedu.mybatisdemo.Mapper;

import cn.tedu.mybatisdemo.pojo.teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface TeacherMapper {
    @Select("select * from teacher;")
    public List<teacher> getTeacherAll();

    @Insert("INSERT INTO teacher VALUES (6666,'光头师傅',22,'宗师',null,100000,50000,'男',0);")
    public int addTeacher();
    @Update("update teacher set salary=1000 where name ='光头师傅'")
    public int update();
    @Delete("delete from teacher where name ='光头师傅';")
    public int delete();

}
