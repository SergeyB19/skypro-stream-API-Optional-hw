package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    Employee minSalaryEmployee((int salary, int departmentId);

    Employee allEmployeeInDepartment(String firstName, String lastName);

    Employee allEmployeeDivisionByDepartment(String firstName, String lastName);


    Employee maxSalaryEmployee(int salary, int departmentId);
}
