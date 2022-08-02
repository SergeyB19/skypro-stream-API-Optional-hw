package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
