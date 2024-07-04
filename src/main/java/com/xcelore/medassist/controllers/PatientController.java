package com.xcelore.medassist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcelore.medassist.entities.Doctor;
import com.xcelore.medassist.entities.Patient;
import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Specialty;
import com.xcelore.medassist.services.DoctorService;
import com.xcelore.medassist.services.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	private final PatientService patientService;
	private final DoctorService doctorService;

    @Autowired
    public PatientController(PatientService patientService, DoctorService doctorService) {
        this.patientService = patientService;
        this.doctorService = doctorService;
    }


    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        Patient createdPatient = patientService.createPatient(patient);
        return ResponseEntity.ok(createdPatient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable String id) {
        patientService.deletePatient(id);
        return ResponseEntity.ok("Patient with UID " + id + " has been deleted.");
    }
    
    @GetMapping("/{id}/suggest-doctors")
    public ResponseEntity<List<Doctor>> suggestDoctors(@PathVariable String id) {
    	
        Patient patient = patientService.getPatientById(id);

        if (patient == null) {
            return ResponseEntity.notFound().build();
        }
        
       
        City city = patient.getCity();
   
        Specialty specialty = patient.getSymptom().getSpecialty();
        List<Doctor> doctors = doctorService.findDoctorsByCityAndSpecialty(city, specialty);
        return ResponseEntity.ok(doctors);
    }
}
