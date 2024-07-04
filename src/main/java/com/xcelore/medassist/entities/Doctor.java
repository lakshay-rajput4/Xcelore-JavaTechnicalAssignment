package com.xcelore.medassist.entities;


import com.xcelore.medassist.enums.City;
import com.xcelore.medassist.enums.Specialty;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;


@Entity
public class Doctor {
	
	@Id
	private String doctoruid;
    private String name;
    private City city;
    private String email;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    

    public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Doctor(String doctoruid, String name, City city, String email, String phoneNumber, Specialty specialty) {
		
		this.doctoruid = doctoruid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.specialty = specialty;
	}

	

	public String getDoctoruid() {
		return doctoruid;
	}



	public void setDoctoruid(String doctoruid) {
		this.doctoruid = doctoruid;
	}



	// Getters and Setters
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
	public String toString() {
		return "Doctor [uid=" + doctoruid + ", name=" + name + ", city=" + city + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", specialty=" + specialty + "]";
	}
}
