package com.example.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.entity.Staff;
import com.example.hospital.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffRepository sr;

	@Override
	public void addStaff(Staff s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteStaffById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllStaff() {
		// TODO Auto-generated method stub

	}

}
