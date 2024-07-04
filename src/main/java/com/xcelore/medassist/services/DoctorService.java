package com.xcelore.medassist.services;

import java.util.List;

import com.xcelore.medassist.entities.Doctor;
import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Specialty;


public interface DoctorService {
	Doctor createDoctor(Doctor doctor);
    void deleteDoctor(String id);
    List<Doctor> findDoctorsByCityAndSpecialty(City city, Specialty specialty);
}
