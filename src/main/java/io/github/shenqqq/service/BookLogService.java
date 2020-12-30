package io.github.shenqqq.service;

import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookLogService {
    int addBookLog(BookLogs booklogs);
    int deleteBookLogById(@Param("bookID") int BookID, @Param("studentID")String studentID);
    BookLogs queryBookLogByBookId(@Param("bookID") int id);
    BookLogs queryBookLogById(@Param("bookID") int BookID, @Param("studentID")String studentID);
    List<BookLogs> queryBookLogByStudentId(@Param("studentID") String id);
    List<BookLogs> queryAllBookLog();
}
