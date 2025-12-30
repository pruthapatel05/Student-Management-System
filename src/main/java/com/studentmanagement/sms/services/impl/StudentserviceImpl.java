package com.studentmanagement.sms.services.impl;
import java.util.List;
import org.springframework.stereotype.Service;

import com.studentmanagement.sms.entity.Studententity;
import com.studentmanagement.sms.repository.Studentrepository;
import com.studentmanagement.sms.services.Studentservices;


@Service
public class StudentserviceImpl implements Studentservices {


    private Studentrepository studentrepository;

    public StudentserviceImpl(Studentrepository studentrepository) {
        super();
        this.studentrepository = studentrepository;
    }


    @Override
    public List<Studententity> getAllStudents(){
        return studentrepository.findAll();
    }
    @Override
    public Studententity saveStudent(Studententity student) {
        return studentrepository.save(student);
    }   
    
    @Override
    public Studententity getStudentById(Long id) {
        return studentrepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
    }
    
    @Override
    public Studententity updateStudent(Studententity student) {
        return studentrepository.save(student);
    }

    @Override
    public Studententity deleteStudentById(Long id) {
        Studententity student = getStudentById(id);
        studentrepository.delete(student);
        return student;
    }
}
