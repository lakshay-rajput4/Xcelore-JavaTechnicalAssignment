package com.xcelore.medassist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcelore.medassist.entities.Doctor;
import com.xcelore.medassist.services.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	 private final DoctorService doctorService;

	    @Autowired
	    public DoctorController(DoctorService doctorService) {
	        this.doctorService = doctorService;
	    }

	    @PostMapping
	    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
	        Doctor createdDoctor = doctorService.createDoctor(doctor);
	        return ResponseEntity.ok(createdDoctor);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteDoctor(@PathVariable String id) {
	        doctorService.deleteDoctor(id);
	        return ResponseEntity.ok("Doctor with UID " + id + " has been deleted.");
	    }
}
