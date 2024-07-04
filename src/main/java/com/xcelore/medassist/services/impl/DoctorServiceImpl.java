package com.xcelore.medassist.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcelore.medassist.dao.DoctorRepository;
import com.xcelore.medassist.entities.Doctor;
import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Specialty;
import com.xcelore.medassist.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	 private final DoctorRepository doctorRepository;

	    @Autowired
	    public DoctorServiceImpl(DoctorRepository doctorRepository) {
	        this.doctorRepository = doctorRepository;
	    }

	    @Override
	    public Doctor createDoctor(Doctor doctor) {
	    	 doctor.setDoctoruid(UUID.randomUUID().toString());
	        return doctorRepository.save(doctor);
	    }

	    @Override
	    public void deleteDoctor(String id) {
	        doctorRepository.deleteById(id);
	    }

	    
	    @Override
	    public List<Doctor> findDoctorsByCityAndSpecialty(City city, Specialty specialty) {
	        return doctorRepository.findByCityAndSpecialty(city, specialty);
	    }
}
