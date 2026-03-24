package com.example.teacherworkloadbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.teacherworkloadbackend.mapper")
public class TeacherWorkloadBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherWorkloadBackendApplication.class, args);
    }

}
