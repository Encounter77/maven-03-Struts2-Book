package edu.cn.service;

import edu.cn.pojo.Book;

import java.sql.ResultSet;
import java.util.List;

public interface BookService {
    public List<Book> selectByType(String type) ;
    public int insertBook(String isbn,String title,String type,double price);
    public List<Book> queryBook();
    public List<Book> updateBook(String isbn);
    public int updateBook_r(String isbn,String title,String type,double price);
    public int deleteBook(String isbn);
}
