package io.github.shenqqq.dao;

import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//根据书的id来增删查改
public interface BookLogMapper {
    int addBookLog(BookLogs booklogs);
    int deleteBookLogById(@Param("bookID") int BookID, @Param("studentID")String studentID);
    BookLogs queryBookLogByBookId(@Param("bookID") int id);
    BookLogs queryBookLogById(@Param("bookID") int BookID, @Param("studentID")String studentID);
    List<BookLogs> queryBookLogByStudentId(@Param("studentID") String id);
    List<BookLogs> queryAllBookLog();
}
