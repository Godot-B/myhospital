package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Patient;
import umc.spring.domain.Reserve;

import java.util.List;
import java.util.Optional;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {

    List<Reserve> findAllByPatient(Optional<Patient> patient);
}
