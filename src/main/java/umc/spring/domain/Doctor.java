package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long id;

    private Year career;

    private String name;

    private String phoneNum;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }
}
