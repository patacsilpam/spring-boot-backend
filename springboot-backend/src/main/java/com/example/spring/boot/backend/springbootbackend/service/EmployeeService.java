package com.example.spring.boot.backend.springbootbackend.service;

import com.example.spring.boot.backend.springbootbackend.model.Employee;
import com.example.spring.boot.backend.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    EmployeeRepository empoyeeRepository;
    @Autowired
    public EmployeeService (EmployeeRepository empoyeeRepository){
        this.empoyeeRepository = empoyeeRepository;
    }
    public List<Employee> getEmployees(){
        /*return List.of(
                new Employee(
                        "John",
                        "Doe",
                        "johndoe.@gmail.com")
        );*/
        return empoyeeRepository.findAll();
    }
}
