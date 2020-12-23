package io.github.shenqqq.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    //拦截器 retutn true 放行并执行下一个拦截器
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("uri: " + request.getRequestURI());
        HttpSession session = request.getSession();
        System.out.println("session: "+session.getAttribute("user"));
        // 如果用户已登陆也放行
        if (request.getRequestURI().contains("login")) {
            System.out.println("login放行");
            return true;
        }
        if(session.getAttribute("user") != null && session.getAttribute("user") != "") {
            System.out.println("session放行");
            return true;
        }
        // 用户没有登陆跳转到登陆页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

}
