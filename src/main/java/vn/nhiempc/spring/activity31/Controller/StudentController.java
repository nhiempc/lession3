package vn.nhiempc.spring.activity31.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.nhiempc.spring.activity31.Model.Student;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public Student getStudent(){
        Student student = new Student();
        student.setName("Nhiệm");
        student.setEmail("nhiem10596@gmail.com");
        student.setMsv("0941360279");
        return student;
    }
}
