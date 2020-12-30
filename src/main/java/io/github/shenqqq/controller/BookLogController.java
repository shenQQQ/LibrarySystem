package io.github.shenqqq.controller;

import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.service.BookLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/user/booklog")
public class BookLogController {
    @Autowired
    @Qualifier("BookLogServiceImpl")
    private BookLogService bookLogService;

    @RequestMapping("/listBookLog")
    public String list(Model model) {
        List<BookLogs> bookLogList = bookLogService.queryAllBookLog();
        System.out.println(bookLogList);
        model.addAttribute("list", bookLogList);
        return "listBookLog";
    }

}
