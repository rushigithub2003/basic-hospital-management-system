package com.example.hospital.service;

import com.example.hospital.entity.Doctor;

public interface DoctorService {

	void addDoctor(Doctor d);
	
	Doctor getDoctorById(int id);
}
