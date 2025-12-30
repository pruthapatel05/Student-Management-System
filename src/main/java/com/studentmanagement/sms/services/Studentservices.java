package com.studentmanagement.sms.services;
import java.util.List;

import com.studentmanagement.sms.entity.Studententity;


public interface Studentservices {

    List<Studententity> getAllStudents();
    Studententity saveStudent(Studententity student);
    Studententity getStudentById(Long id);
    Studententity updateStudent(Studententity student);
    Studententity deleteStudentById(Long id);
}
