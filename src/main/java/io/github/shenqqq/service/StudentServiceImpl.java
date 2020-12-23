package io.github.shenqqq.service;

import io.github.shenqqq.dao.StudentMapper;
import io.github.shenqqq.pojo.Students;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    @Override
    public int addStudent(Students students) {
        return studentMapper.addStudent(students);
    }

    @Override
    public int deleteStudentById(String  id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Students students) {
        return studentMapper.updateStudent(students);
    }

    @Override
    public Students queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<Students> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    @Override
    public Students queryStudentByName(String studentName) {
        return studentMapper.queryStudentByName(studentName);
    }
}
