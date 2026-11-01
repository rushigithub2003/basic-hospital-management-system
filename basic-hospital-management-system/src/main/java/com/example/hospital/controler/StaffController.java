package com.example.hospital.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.entity.Staff;
import com.example.hospital.service.StaffService;

@RestController
public class StaffController {

	private StaffService staffService;

	@Autowired
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	// create REST API to add Staff
	@PostMapping("staff")
	String addStaff(@RequestBody Staff s) {
		staffService.addStaff(s);
		return "Staff Added..";
	}

	// create REST API to get existing staff information
	@GetMapping("staff/{id}")
	Staff getStaffById(@PathVariable int id) {
		return staffService.getStaffById(id);
	}

	// create rest api to delete existing staff by id
	@DeleteMapping("staff/{id}")
	String deleteStaffById(@PathVariable int id) {
		staffService.deleteStaffById(id);
		return "staff deleted";

	}

	// create rest api to delete all staff.
	@DeleteMapping("staff")
	String deleteAllStaff() {
		staffService.deleteAllStaff();
		return "All Staff Delete";
	}

}
