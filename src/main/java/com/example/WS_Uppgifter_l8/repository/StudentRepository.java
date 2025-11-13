package com.example.WS_Uppgifter_l8.repository;

import com.example.WS_Uppgifter_l8.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findStudentById (Long id);
}
