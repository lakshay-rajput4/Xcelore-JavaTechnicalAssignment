package com.xcelore.medassist.enums;

public enum Symptom {
	ARTHRITIS(Specialty.ORTHOPAEDIC),
    BACK_PAIN(Specialty.ORTHOPAEDIC),
    TISSUE_INJURIES(Specialty.ORTHOPAEDIC),
    DYSMENORRHEA(Specialty.GYNECOLOGY),
    SKIN_INFECTION(Specialty.DERMATOLOGY),
    SKIN_BURN(Specialty.DERMATOLOGY),
    EAR_PAIN(Specialty.ENT_SPECIALIST);

    private final Specialty specialty;

    Symptom(Specialty specialty) {
        this.specialty = specialty;
    }

    public Specialty getSpecialty() {
        return specialty;
    }
}
