package io.github.shenqqq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

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
        return "user";
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
