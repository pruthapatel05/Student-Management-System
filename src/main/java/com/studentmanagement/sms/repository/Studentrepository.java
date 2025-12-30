package com.studentmanagement.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagement.sms.entity.Studententity;

@Repository
public interface Studentrepository extends JpaRepository<Studententity, Long> {

}
