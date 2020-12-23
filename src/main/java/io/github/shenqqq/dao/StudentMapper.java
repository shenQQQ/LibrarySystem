package io.github.shenqqq.dao;

import io.github.shenqqq.pojo.Books;
import io.github.shenqqq.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int addStudent(Students students);
    int deleteStudentById(@Param("studentID") String id);
    int updateStudent(Students students);
    Students queryStudentById(@Param("studentID") String id);
    Students queryStudentByName(@Param("studentName")String studentName);
    List<Students> queryAllStudent();
}
