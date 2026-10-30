package com.example.hospital.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.entity.Patient;
import com.example.hospital.service.PatientService;

@RestController
public class PatientController {

	private PatientService patientService;

	public void setPatientService(PatientService patientServiceImpl) {
		this.patientService = patientServiceImpl;
	}

	// API to add Patient
	@PostMapping("patient")
	String addPatient(@RequestBody Patient p) {
		patientService.addPatient(p);
		return "Patient Added";
	}
	
	//API to get patient info from DB
	@GetMapping("patient/{id}")
	Patient getPatient(@PathVariable int id)
	{
		return patientService.getPatientById(id);
	}
	
	//API to delete patient by id
	@DeleteMapping("patient/{id}")
	String deletePatientById(@PathVariable int id)
	{
		patientService.deletePatientById(id);
		return "Patient Deleted";
	}

}
