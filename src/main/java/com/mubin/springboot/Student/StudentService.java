package com.mubin.springboot.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Service Layer or Business Layer
    public List<Student> getStudents(){

        return studentRepository.findAll();
    }
}
