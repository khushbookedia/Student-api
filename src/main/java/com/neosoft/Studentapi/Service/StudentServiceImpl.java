package com.neosoft.Studentapi.Service;

import com.neosoft.Studentapi.Dao.StudentDao;
import com.neosoft.Studentapi.Entity.Project;
import com.neosoft.Studentapi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    @Transactional
    public Student getStudent(int studentId) {
        return studentDao.findById(studentId).get();
    }

    @Override
    @Transactional
    public Student registerStudent(Student student) {


        return studentDao.save(student);
    }

    public List<Student> getAllStudents(){
        return studentDao.findAll();
    }
}
