package com.talha.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talha.SpringDataJPA.model.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("select s from Student s where s.name = ?1")
//    List<Student> findByName(String name);
//    List<Student> findByMarksGreaterThan(int marks);

    
}
