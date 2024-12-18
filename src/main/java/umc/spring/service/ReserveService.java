package umc.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Doctor;
import umc.spring.domain.Patient;
import umc.spring.domain.Reserve;
import umc.spring.repository.PatientRepository;
import umc.spring.repository.ReserveRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReserveService {

    private final ReserveRepository reserveRepository;
    private final PatientRepository patientRepository;

    @Transactional            //폼 객체 사용해야 ---->
    public void createReserve(Patient patient, Doctor doctor) {
        //예시
        Reserve reserve = new Reserve(patient, doctor);
        reserveRepository.save(reserve);
    }

    public List<Reserve> getReserveList(Long patientId) {
        Optional<Patient> patient = patientRepository.findById(patientId);
        List<Reserve> reserveList = reserveRepository.findAllByPatient(patient);
        return reserveList;
    }

    @Transactional
    public void deleteReserve(Reserve reserve) {
        reserveRepository.delete(reserve);
    }
}
