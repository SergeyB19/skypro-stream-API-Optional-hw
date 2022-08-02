package com.example.skyprostreamapioptionalhw.service;

import com.example.skyprostreamapioptionalhw.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.stream.Stream;

@Service
public class DepartmentServiceimpl {
    private EmployeeServiceimpl employeeServiceimpl;

    public DepartmentServiceimpl(EmployeeServiceimpl employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @Override
    public Employee maxSalaryEmployee(int salary, int departmentId) {
        Comparator.comparingInt(employee -> employee.getSalary()) {
        }
    }


    @Override
    public Employee minSalaryEmployee(int salary, int departmentId) {
        Stream<Integer> min = Stream.of(salary);
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
