package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
