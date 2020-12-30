package io.github.shenqqq.controller;

import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.pojo.Books;
import io.github.shenqqq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user/borrowbook")
public class BorrowBookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    BookService bookService;

    @RequestMapping("/borrowBook")
    public String list(Model model) {
        List<Books> bookList = bookService.queryAllBook();
        model.addAttribute("list", bookList);
        return "borrowBook";
    }
    @RequestMapping("/updateBorrowBook")
    public String toPaper(Books books){
        int num = bookService.updateBook(books);
        if(num!= 0)
        {
            System.out.println("修改成功");
        }
        return "totoUpdateBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateBorrowBook";
    }

    @RequestMapping("/toReturnBook")
    public String toReturnPaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateReturnBook";
    }

    @RequestMapping("/toupdateReturnBook")
    public String updateBorrowBook(Integer id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "totoReturnBook";
    }

    @RequestMapping("/tototoReturnBook")
    public  String toReturnBookLog(Books books){
        int num = bookService.updateBook(books);
        if (num!=0)
        {
            System.out.println("归还成功");
        }
        return "redirect:/user/borrowbook/returnBook";

    }

}
