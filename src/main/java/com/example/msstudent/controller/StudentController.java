package com.example.msstudent.controller;

import com.example.msstudent.model.Student;
import com.example.msstudent.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {

        private final StudentService studentService;

        public StudentController(StudentService studentService)
        {
            this.studentService = studentService;
        }

        @PostMapping
        public String setStudent(@RequestBody Student student) {
            return studentService.setStudent(student);

        }

        @GetMapping("/UtpAlumnos")
        public List<Student> obtenerAlumnosActivos() {
            return studentService.studentList();
        }

    }
