package com.codegym.springboot.service.impl;

import com.codegym.springboot.model.Student;
import com.codegym.springboot.repository.StudentRepository;
import com.codegym.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
