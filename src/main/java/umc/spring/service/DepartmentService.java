package umc.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Department;
import umc.spring.domain.Doctor;
import umc.spring.repository.DepartmentRepository;
import umc.spring.repository.DoctorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DepartmentService {

    private final DoctorRepository doctorRepository;
    private final DepartmentRepository departmentRepository;

    public List<Doctor> getDoctors(Long departmentId) {

        Department department = departmentRepository.findById(departmentId).get();

        List<Doctor> doctors = doctorRepository.findDoctorsByDepartment(department);
        return doctors;
    }

    @Transactional                            //폼객체 사용해야
    public void joinDoctor(Long departmentId, Doctor doctor) {

        Department department = departmentRepository.findById(departmentId).get();

        Doctor joinDoctor = doctorRepository.save(doctor);
        joinDoctor.setDepartment(department);
    }
}
