package com.talha.SpringJDBC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.talha.SpringJDBC.model.Student;
import com.talha.SpringJDBC.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){

        repo.save(s);

    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
    
}
