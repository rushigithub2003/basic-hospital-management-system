package com.example.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.entity.Patient;
import com.example.hospital.repository.PatientRepository;

@Service
//@Primary
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository pr;

	@Override
	public void addPatient(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}
	
	void deletePatientById(int id)
	{
		pr.deleteById(id);
	}
	
	void deleteAllPatient()
	{
		pr.deleteAll();
	}

}
