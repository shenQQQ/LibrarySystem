package io.github.shenqqq.controller;

import io.github.shenqqq.pojo.Students;
import io.github.shenqqq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user/student")
public class StudentController {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/listStudent")
    public String list(Model model) {
        List<Students> studentList = studentService.queryAllStudent();
        model.addAttribute("list", studentList);
        return "listStudent";
    }

    @RequestMapping("/toAddStudent")
    public String toAddStudent() {
        return "addStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Students students) {
        System.out.println(students);
        int num = studentService.addStudent(students);
        if(num!=0){
            System.out.println("添加成功");
        }
        return "redirect:/user/student/listStudent";
    }

    @RequestMapping("/toUpdateStudent")
    public String toUpdatePaper(String studentID,Model model){
        Students students = studentService.queryStudentById(studentID);
        model.addAttribute("students",students);
        return "updateStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Students students){
        int num = studentService.updateStudent(students);
        if(num!=0){
            System.out.println("修改成功");
        }
        return "redirect:/user/student/listStudent";
    }

    @RequestMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") String id){
        studentService.deleteStudentById(id);
        return "redirect:/user/student/listStudent";
    }

    @RequestMapping("/queryStudent")
    public String queryStudent(String queryStudentName,Model model){
        Students students = studentService.queryStudentByName(queryStudentName);
        System.out.println(queryStudentName);
        List<Students> list = new ArrayList<Students>();
        list.add(students);
        if(students == null)
        {
            list =  studentService.queryAllStudent();
            model.addAttribute("error", "未找到");
        }
        model.addAttribute("list", list);
        return "listStudent";
    }
}
