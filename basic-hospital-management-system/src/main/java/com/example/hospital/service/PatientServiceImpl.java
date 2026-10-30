package com.example.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hospital.entity.Patient;
import com.example.hospital.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository pr;

	@Override
	public void addPatient(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

}
