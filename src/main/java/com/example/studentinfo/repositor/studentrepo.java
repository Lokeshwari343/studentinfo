package com.example.studentinfo.repositor;

import com.example.studentinfo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface studentrepo extends JpaRepository<student,Integer> {
}
