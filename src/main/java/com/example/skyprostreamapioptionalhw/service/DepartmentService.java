package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    Employee minSalaryEmployee(int departmentId);

    Employee allEmployeeInDepartment();

    Employee allEmployeeDivisionByDepartment();


    Employee maxSalaryEmployee(int departmentId);
}
