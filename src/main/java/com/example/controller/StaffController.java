package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.StaffBusiness;
import com.example.entity.Staff;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffBusiness staffBusiness;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Staff> getAllStaffs() {
		return staffBusiness.getAllStaffs();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Staff getStaffId(@PathVariable long id) {
        return staffBusiness.getStaffId(id);
    }

	@RequestMapping(value = "/addStaff", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public Staff addNewUser(@RequestBody Staff staff) {
		return staffBusiness.addStaff(staff);
	}

}
