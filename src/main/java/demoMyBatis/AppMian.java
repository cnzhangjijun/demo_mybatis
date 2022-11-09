package demoMyBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "demoMyBatis.dao")
public class AppMian {

    public static void main(String[] args) {
        SpringApplication.run(AppMian.class, args);
    }
}
