package demoMyBatis.pojo;

import java.io.Serializable;

public class Book implements Serializable {

    private String id;
    private String bookname;
    private String bookpage;
    private String bookauthor;
    private String bookdescribe;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", bookname='" + bookname + '\'' +
                ", bookpage='" + bookpage + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookdescribe='" + bookdescribe + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookpage() {
        return bookpage;
    }

    public void setBookpage(String bookpage) {
        this.bookpage = bookpage;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookdescribe() {
        return bookdescribe;
    }

    public void setBookdescribe(String bookdescribe) {
        this.bookdescribe = bookdescribe;
    }
}
