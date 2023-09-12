package com.example.msstudent.service.impl;

import com.example.msstudent.model.Student;
import com.example.msstudent.repository.StudentRepository;
import com.example.msstudent.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public String setStudent(Student student) {
        if(student.getEdad() <80) {
            studentRepository.save(student);
        }else{
            return "No cumple la edad ";
        }
    return "se grabo con exito";
    }

    @Override
    public List<Student> studentList() {
        return studentRepository.findAllByEstado(true);

    }
}