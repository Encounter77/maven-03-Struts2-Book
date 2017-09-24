package edu.cn.action;

import com.opensymphony.xwork2.ActionContext;
import edu.cn.service.BookService;
import edu.cn.service.impl.BookServiceImp;


public class BookAction {
    private String isbn;
    private String title;
    private String type;
    private double price;
    private BookService bookService = new BookServiceImp();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String execute() throws Exception {
        ActionContext.getContext().put("booklist", bookService.selectByType(type));
        return "success";
    }

    public String insert() throws Exception{
        if(isbn!=null && title!=null && type!=null && price!=0){
            int insertR = bookService.insertBook(isbn,title,type,price);
            if(insertR == 1){
                return "success";
            }
            return "error";
        }
        return "error";
    }

    public String query(){
        ActionContext.getContext().put("books",bookService.queryBook());
        return "success";
    }

    public String update(){
        ActionContext.getContext().put("update_book_list",bookService.updateBook(isbn));
        return "success";
    }

    public String update_r(){
        int result = bookService.updateBook_r(isbn,title,type,price);
        if(result==1)
            return "success";
        return "error";
    }

    public String delete(){
        int result = bookService.deleteBook(isbn);
        if(result==1)
            return "success";
        return "error";
    }
}
