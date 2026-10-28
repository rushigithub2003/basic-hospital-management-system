package com.example.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hospital.entity.Doctor;
import com.example.hospital.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository dr;

	@Override
	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		dr.save(d);
	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		dr.findById(id).get();
		return null;
	}

	@Override
	public void deleteDoctorById(int id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
	}

}
