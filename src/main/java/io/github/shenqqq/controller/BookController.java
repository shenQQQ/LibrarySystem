package io.github.shenqqq.controller;

import io.github.shenqqq.pojo.Books;
import io.github.shenqqq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    BookService bookService;

    @RequestMapping("/listBook")
    public String list(Model model) {
        List<Books> bookList = bookService.queryAllBook();
        model.addAttribute("list", bookList);
        return "listBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook"; 
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println(books);
        int num = bookService.addBook(books);
        if(num!=0){
            System.out.println("添加成功");
        }
        return "redirect:/user/book/listBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        int num = bookService.updateBook(books);
        if(num!=0){
            System.out.println("修改成功");
        }
        return "redirect:/user/book/listBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/user/book/listBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null)
        {
            list =  bookService.queryAllBook();
            model.addAttribute("error", "未找到");
        }
        model.addAttribute("list", list);
        return "listBook";
    }
}
