package demoMyBatis.dao;

import demoMyBatis.pojo.Book;
import demoMyBatis.pojo.Student;


import java.util.List;

public interface  StudentMapper {

    public List<Student> selectAllStudent();

    public List<Book> selectBooks();





 }
