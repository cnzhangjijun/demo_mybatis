package demoMyBatis;
import demoMyBatis.dao.StudentMapper;
import demoMyBatis.pojo.Book;
import demoMyBatis.pojo.Student;
import demoMyBatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/")
public class AppController {

    @Autowired
    private StudentService studentService;

    @GetMapping("students")
    public String queryallstudent(){

        List<Student>  students =studentService.selectAllStudent();
        return students.toString();
    }

    @GetMapping("books")
    public String queryallbooks(){

        List<Book>  books =studentService.selectAllBook();
        return books.toString();

    }

    @PutMapping
    public String queryallstudent(Student std){

        System.out.println("master branch hello");
        return "";

    }


}
