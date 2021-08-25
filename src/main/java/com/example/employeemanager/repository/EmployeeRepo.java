package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional <Employee> findEmployeeById(Long id);

    @Query(value="SELECT * from employee where phone = ?1", nativeQuery = true)
    List <Employee> getEmployeeByPhone(String status);

}
