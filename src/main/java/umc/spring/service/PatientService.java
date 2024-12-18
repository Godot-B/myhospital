package umc.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Patient;
import umc.spring.repository.PatientRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional          //DTO 사용해야
    public void joinPatient(Patient patient) {
        patientRepository.save(patient);
    }
}
