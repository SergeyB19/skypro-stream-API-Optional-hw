package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    Employee minSalaryEmployee(int departmentId);

    Employee allEmployeeInDepartment(int departmentId);

    Employee allEmployeeDivisionByDepartment(int departmentId);


    Employee maxSalaryEmployee(int departmentId);
}
