package com.xcelore.medassist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcelore.medassist.entities.Doctor;
import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Specialty;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String>{
	List<Doctor> findByCityAndSpecialty(City city, Specialty specialty);
}