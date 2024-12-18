package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
