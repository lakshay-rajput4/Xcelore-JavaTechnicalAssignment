package com.xcelore.medassist.entities;

import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Symptom;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private String patientuid;
    private String name;
    private City city;
    private String email;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Symptom symptom;
    
    
    
    public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(String patientuid, String name, City city, String email, String phoneNumber, Symptom symptom) {
	
		this.patientuid = patientuid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.symptom = symptom;
	}
    
	
	public String getPatientuid() {
		return patientuid;
	}


	public void setPatientuid(String patientuid) {
		this.patientuid = patientuid;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Symptom getSymptom() {
		return symptom;
	}
	public void setSymptom(Symptom symptom) {
		this.symptom = symptom;
	}
	@Override
	public String toString() {
		return "Patient [uid=" + patientuid + ", name=" + name + ", city=" + city + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", symptom=" + symptom + "]";
	}
}
