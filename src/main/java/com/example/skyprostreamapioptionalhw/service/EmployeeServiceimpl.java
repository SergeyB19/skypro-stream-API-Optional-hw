package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.exception.EmployeeAlreadyAddedException;
import com.example.skyprostreamapioptionalhw.exception.EmployeeNotFoundException;
import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
    public class EmployeeServiceimpl implements EmployeeService {
    private Map<String, Employee> employees;

    public void EmployeeServiceimpl(List<Employee> employeeList)  {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee maxSalaryEmployee(int salary, int departmentId) {
        Comparator.comparingInt(employee -> employee.getSalary()) {
        }
    }

    @Override
    public Employee minSalaryEmployee(int salary, int departmentId) {
        Comparator.comparingInt(employee -> employee.getSalary()) {
        }
    }

    @Override
    public Employee allEmployeeInDepartment(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
    }

    @Override
    public Employee allEmployeeDivisionByDepartment(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
    }
        }



