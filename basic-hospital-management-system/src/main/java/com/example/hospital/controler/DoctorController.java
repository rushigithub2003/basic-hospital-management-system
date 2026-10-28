package com.example.hospital.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.entity.Doctor;
import com.example.hospital.service.DoctorService;

@RestController
public class DoctorController {

	DoctorService doctorService;

	@Autowired
	public void setDoctorService(DoctorService doctorServiceImpl) {
		this.doctorService = doctorServiceImpl;
	}

	// addDoctor
	@PostMapping("doctor")
	String addDoctor(@RequestBody Doctor d) {
		doctorService.addDoctor(d);
		return "Doctor Added";
	}

}
