package io.github.shenqqq.service;

import io.github.shenqqq.dao.BookLogMapper;
import io.github.shenqqq.pojo.BookLogs;
import io.github.shenqqq.pojo.Books;

import java.util.List;

public class BookLogServiceImpl implements BookLogService {

    private BookLogMapper bookLogMapper;

    public void setBookLogMapper(BookLogMapper bookLogMapper)
    {
        this.bookLogMapper = bookLogMapper;
    }

    @Override
    public int addBookLog(BookLogs booklogs) {
        return bookLogMapper.addBookLog(booklogs);
    }

    @Override
    public int deleteBookLogById(int BookID, String studentID) {
        return bookLogMapper.deleteBookLogById(BookID,studentID);
    }

    @Override
    public BookLogs queryBookLogById(int BookID, String studentID) {
        return bookLogMapper.queryBookLogById(BookID,studentID);
    }

    @Override
    public BookLogs queryBookLogByBookId(int id) {
        return bookLogMapper.queryBookLogByBookId(id);
    }

    @Override
    public List<BookLogs> queryBookLogByStudentId(String id) {
        return bookLogMapper.queryBookLogByStudentId(id);
    }

    @Override
    public List<BookLogs> queryAllBookLog() {
        return bookLogMapper.queryAllBookLog();
    }
}
