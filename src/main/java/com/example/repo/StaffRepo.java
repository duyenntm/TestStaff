package com.example.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Long> {

	Staff findById(long id);

}
