package com.example.SpringBootMysqlDocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootMysqlDocker.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
