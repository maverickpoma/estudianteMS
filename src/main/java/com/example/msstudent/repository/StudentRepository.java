package com.example.msstudent.repository;

import com.example.msstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

        Student save(Student student);
        List<Student> findAllByEstado(boolean estado);
        Optional<Student> findById(Long id);
}

