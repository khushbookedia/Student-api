package com.neosoft.Studentapi.Controller;

import com.neosoft.Studentapi.Entity.Student;
import com.neosoft.Studentapi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/register" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_ADMIN')")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student){

        return ResponseEntity.ok(studentService.registerStudent(student));
    }


}
