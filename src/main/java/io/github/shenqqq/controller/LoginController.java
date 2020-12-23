package io.github.shenqqq.controller;

import io.github.shenqqq.pojo.Students;
import io.github.shenqqq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/login")
    public String login(String username, Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("user", username);
        if(username == null || username.equals("") )
        {
            session.setAttribute("user", null);
            return "login";
        }
        if(username.equals("root"))
        {
            return "root";
        }
        Students students = studentService.queryStudentByName(username);
        if(students != null)
        {

            return "user";
        }
        model.addAttribute("error", "学生不存在");
        session.setAttribute("user", null);
        return "login";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("user");
        return "root";
    }

    @RequestMapping("/goLogin")
    public String login(){
        return "login";
    }

    @RequestMapping("/root")
    public String main(){
        return "root";
    }
}
