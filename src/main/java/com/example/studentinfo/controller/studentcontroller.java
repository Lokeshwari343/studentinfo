package com.example.studentinfo.controller;

import com.example.studentinfo.model.student;
import com.example.studentinfo.service.studentserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sriindu")
public class studentcontroller {
    @Autowired
    private studentserv service;

    @PostMapping("/addstudent")
    public student addstudent(@RequestBody student student) {
        return service.createstudent(student);
    }

    @PostMapping("/addstudents")
    public List<student> addstudent(@RequestBody List<student> students) {
        return service.createstudents(students);
    }

    @GetMapping("/students")
    public List<student> getstudents() {
        return service.getstudents();

    }

    @GetMapping("/student/{id}")
    public student getstudent(@PathVariable int id) {
        return service.getstudent(id);

    }

    @DeleteMapping("/student/{id}")
    public String deletestudent(@PathVariable int id) {
        return service.deletestudent(id);
    }

    @PutMapping("/student/{id}")
    public student updatestudent(@PathVariable int id,@RequestBody student student){
        return service.updatestudent(id, student);
    }


}

