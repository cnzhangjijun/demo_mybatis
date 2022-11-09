package demoMyBatis.service.impl;
import demoMyBatis.dao.StudentMapper;
import demoMyBatis.pojo.Book;
import demoMyBatis.pojo.Student;
import demoMyBatis.service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public List<Book> selectAllBook() {
        return studentMapper.selectBooks();
    }


}
