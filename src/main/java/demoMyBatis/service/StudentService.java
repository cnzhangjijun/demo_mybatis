package demoMyBatis.service;
import demoMyBatis.pojo.Book;
import demoMyBatis.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentService {

    public List selectAllStudent();

    public List<Book> selectAllBook();

}
