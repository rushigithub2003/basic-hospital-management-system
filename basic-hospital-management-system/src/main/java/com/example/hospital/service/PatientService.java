package com.example.hospital.service;

import com.example.hospital.entity.Patient;

public interface PatientService {
	
	void addPatient(Patient p);
	
	Patient getPatientById(int id);

}
