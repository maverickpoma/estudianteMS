package com.example.msstudent.service;



import com.example.msstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    String setStudent(Student student);
    List<Student> studentList();
}
