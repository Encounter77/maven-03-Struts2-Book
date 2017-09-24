package edu.cn.service.impl;

import edu.cn.dao.DbConnection;
import edu.cn.pojo.Book;
import edu.cn.service.BookService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookServiceImp implements BookService {
    public List<Book> selectByType(String type) {

        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        List<Book> list = new ArrayList<Book>();
        ResultSet result = null;
        Book book= null;

        try {
            pstmt = con.prepareStatement("select isbn,title,type,price from bookta where type = ?");
            pstmt.setString(1,type);
            result = pstmt.executeQuery();

            while(result.next()){
                book = new Book();
                book.setIsbn(result.getString(1));
                book.setTitle(result.getString(2));
                book.setType(result.getString(3));
                book.setPrice(result.getDouble(4));
                System.out.println(type);
                list.add(book);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (result != null)
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

        return list;
    }

    public int insertBook(String isbn, String title, String type, double price) {
        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        int result = -10;
        try {
            pstmt = con.prepareStatement("insert into bookta values('"+isbn+"','"+title+"','"+type+"',"+price
                    +")");
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }

    public List<Book> queryBook() {
        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        List<Book> list = new ArrayList<Book>();
        ResultSet result = null;
        Book book= null;
        try {
            pstmt = con.prepareStatement("select * from bookta");
            result = pstmt.executeQuery();

            while(result.next()){
                book = new Book();
                book.setIsbn(result.getString(1));
                book.setTitle(result.getString(2));
                book.setType(result.getString(3));
                book.setPrice(result.getDouble(4));
                list.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (result != null)
                try {
                    result.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

        return list;
    }

    public List<Book> updateBook(String isbn){
        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        List<Book> list = new ArrayList<Book>();
        ResultSet rs = null;
        Book book = null;
        try {
            pstmt = con.prepareStatement("select * from bookta where isbn='"+isbn+"'");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                book = new Book();
                book.setIsbn(rs.getString(1));
                book.setTitle(rs.getString(2));
                book.setType(rs.getString(3));
                book.setPrice(rs.getDouble(4));
                list.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return list;
    }

    public int updateBook_r(String isbn, String title, String type, double price) {
        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        int result = -10;
        try {
            pstmt = con.prepareStatement("update bookta set title='"+title+"',type='"+type+"',price="+price+"where isbn='"+isbn+"'");
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }

    public int deleteBook(String isbn) {
        Connection con = DbConnection.getConnect();
        PreparedStatement pstmt = null;
        int result = -10;
        try {
            pstmt = con.prepareStatement("delete from bookta where isbn='"+isbn+"'");
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (pstmt != null)
                try {
                    pstmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return result;
    }
}
