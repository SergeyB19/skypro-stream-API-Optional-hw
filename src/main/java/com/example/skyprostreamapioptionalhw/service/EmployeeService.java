package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee minSalaryEmployee((int salary, int departmentId);


    Employee allEmployeeInDepartment(String firstName, String lastName);

    Employee allEmployeeDivisionByDepartment(String firstName, String lastName);


    Employee maxSalaryEmployee(int salary, int departmentId);
}
