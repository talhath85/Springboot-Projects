package com.talha.SpringDataJPA;

import com.talha.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		 Student s1 = context.getBean(Student.class);
		 Student s2 = context.getBean(Student.class);
		 Student s3 = context.getBean(Student.class);

//		 s1.setRollNo(27);
//		 s1.setName("Th");
//		 s1.setMarks(21);

		// s2.setRollNo(33);
		// s2.setName("Mzn");
		// s2.setMarks(21);

		 s3.setRollNo(15);
		 s3.setName("Ry");
		 s3.setMarks(17);

		// repo.save(s2);
		// repo.save(s3);

//		Optional<Student> s = repo.findById(21);
//
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Th"));
//		System.out.println(repo.findByMarksGreaterThan(15));

//		repo.save(s1);
		repo.delete(s3);
	}

}
