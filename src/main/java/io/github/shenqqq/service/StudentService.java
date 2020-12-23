package io.github.shenqqq.service;

import io.github.shenqqq.pojo.Students;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    int addStudent(Students students);
    int deleteStudentById(String id);
    int updateStudent(Students students);
    Students queryStudentById(String id);
    List<Students> queryAllStudent();
    Students queryStudentByName(String studentName);
}
