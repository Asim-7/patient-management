package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setFirstName(patient.getFirstName());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setEmail(patient.getEmail());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());

        return patientResponseDTO;
    }
}
