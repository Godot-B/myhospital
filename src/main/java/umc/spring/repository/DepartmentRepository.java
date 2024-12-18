package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
