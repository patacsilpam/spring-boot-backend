package com.example.spring.boot.backend.springbootbackend.service;

import com.example.spring.boot.backend.springbootbackend.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    public List<Employee> getEmployees(){
        return List.of(
                new Employee(
                        1L,
                        "John",
                        "Doe",
                        "johndoe.@gmail.com")
        );
    }
}
