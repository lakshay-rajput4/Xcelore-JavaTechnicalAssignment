# Xcelore-JavaTechnicalAssignment
"Doctor-Patient Management System: RESTful APIs for doctor and patient management, with location-based doctor suggestions. Built with Spring Boot."

## API Endpoints

### Doctors

- **Create Doctor**
    ```
    POST /doctors
    ```
  ![CreateDoctor](https://github.com/lakshay-rajput4/Xcelore-JavaTechnicalAssignment/assets/137695779/a6d5b69b-3dff-4272-aa9f-c196f7d505c0)


- **Delete Doctor**
    ```
    DELETE /doctors/{id}
    ```
    ![RemoveDoctor](https://github.com/lakshay-rajput4/Xcelore-JavaTechnicalAssignment/assets/137695779/bc61c658-a2d8-4f59-acd7-f5db895b08fc)


### Patients

- **Create Patient**
    ```
    POST /patients
    ```
   ![CreatePatient](https://github.com/lakshay-rajput4/Xcelore-JavaTechnicalAssignment/assets/137695779/3e9e1bff-89bd-4b64-81f5-c806a5a835a0)


- **Delete Patient**
    ```
    DELETE /patients/{id}
    ```
    ![RemovePatient](https://github.com/lakshay-rajput4/Xcelore-JavaTechnicalAssignment/assets/137695779/d364cdbd-f4b7-461f-8b51-246977d959b8)


### Suggesting Doctors

- **Suggest Doctors for a Patient**
    ```
    GET /patients/{id}/suggest-doctors
    ```
  ![Suggest-Doctor](https://github.com/lakshay-rajput4/Xcelore-JavaTechnicalAssignment/assets/137695779/1a9809ba-641e-4d05-926e-9c8969f41fc2)


## Entities

### Doctor

- **Fields:**
    - `id` (String)
    - `name` (String)
    - `city` (City enum: DELHI, NOIDA, FARIDABAD)
    - `email` (String)
    - `phoneNumber` (String)
    - `specialty` (Specialty enum: ORTHOPAEDIC, GYNECOLOGY, DERMATOLOGY, ENT_SPECIALIST)

### Patient

- **Fields:**
    - `id` (String)
    - `name` (String)
    - `city` (String)
    - `email` (String)
    - `phoneNumber` (String)
    - `symptom` (Symptom enum: ARTHRITIS, BACK_PAIN, TISSUE_INJURIES, DYSMENORRHEA, SKIN_INFECTION, SKIN_BURN, EAR_PAIN)
          **Future scope for symptom - Instead of just (Symptom symptom) we can use (List<Symptom>) because patients can have more than one symptom.**

## Enums

### City Enum

- **Values:**
    - DELHI
    - NOIDA
    - FARIDABAD

### Specialty Enum

- **Values:**
    - ORTHOPAEDIC
    - GYNECOLOGY
    - DERMATOLOGY
    - ENT_SPECIALIST

### Symptom Enum

- **Values:**
    - ARTHRITIS (Orthopaedic specialty)
    - BACK_PAIN (Orthopaedic specialty)
    - TISSUE_INJURIES (Orthopaedic specialty)
    - DYSMENORRHEA (Gynecology specialty)
    - SKIN_INFECTION (Dermatology specialty)
    - SKIN_BURN (Dermatology specialty)
    - EAR_PAIN (ENT specialist)

