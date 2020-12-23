package io.github.shenqqq.dao;

import io.github.shenqqq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int deleteBookById(@Param("bookID") int id);
    int updateBook(Books books);
    Books queryBookById(@Param("bookID") int id);
    Books queryBookByName(@Param("bookName")String bookName);
    List<Books> queryAllBook();
}
