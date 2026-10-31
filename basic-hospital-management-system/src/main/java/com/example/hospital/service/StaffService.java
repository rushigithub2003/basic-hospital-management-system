package com.example.hospital.service;

import com.example.hospital.entity.Staff;

public interface StaffService {

	void addStaff(Staff s);

	Staff getStaffById(int id);

	void deleteStaffById(int id);

	void deleteAllStaff();

}
