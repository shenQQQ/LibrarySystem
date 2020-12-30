package io.github.shenqqq.controller;

import com.mysql.cj.Session;
import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.pojo.Books;
import io.github.shenqqq.service.BookLogService;
import io.github.shenqqq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;
import java.util.*;

@Controller
@RequestMapping("/user/borrowbook")
public class BorrowBookLogController {
    @Autowired
    @Qualifier("BookLogServiceImpl")
    private BookLogService bookLogService;

    @RequestMapping("/totoUpdateBook")
    public String updateBorrowBook(Books books, HttpServletRequest request){
        HttpSession session = request.getSession();
        int num = books.getBookID();
        String name = (String) session.getAttribute("user");
        BookLogs logs = new BookLogs();
        logs.setBookID(num);
        logs.setStudentID(name);
        bookLogService.addBookLog(logs);
        return "redirect:/user/borrowbook/borrowBook";
    }

    @RequestMapping("/returnBook")
    public String returnlist(Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        List<BookLogs> bookLogList = bookLogService.queryBookLogByStudentId(user);
        model.addAttribute("list", bookLogList);
        return "returnBook";
    }


    @RequestMapping("/toUpdateBookLog")
    public String toUpdatePaper(Integer id,Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        System.out.println("1");
        BookLogs bookLogs = bookLogService.queryBookLogById(id,user);
        System.out.println("2");
        model.addAttribute("booklogs",bookLogs);
        bookLogService.deleteBookLogById(id,user);
        System.out.println("3");
        return "updateReturnBook";
    }


    @RequestMapping("/totoReturnBook")
    public  String totoReturnBook(int id,HttpServletRequest request){
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        int num = bookLogService.deleteBookLogById(id,user);
        if(num!=0){
            System.out.println("修改成功");
        }
        return "tototoReturnBook";
    }
}
