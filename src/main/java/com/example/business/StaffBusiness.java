package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Staff;
import com.example.repo.StaffRepo;

@Service
public class StaffBusiness {

	@Autowired
	private StaffRepo staffRepo;

	public List<Staff> getAllStaffs() {
		return staffRepo.findAll();
	}
	
	public Staff getStaffId(long id) {
		return staffRepo.findOne(id);
	}

	public Staff addStaff(Staff staff) {
		return staffRepo.save(staff);
	}

}
