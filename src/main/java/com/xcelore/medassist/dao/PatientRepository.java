package com.xcelore.medassist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xcelore.medassist.entities.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{
	
}