package com.example.skyprostreamapioptionalhw.controller;

import com.example.skyprostreamapioptionalhw.model.Employee;
import com.example.skyprostreamapioptionalhw.service.EmployeeServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeServiceimpl employeeServiceimpl;

    public EmployeeController(EmployeeServiceimpl employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @GetMapping(path = "/departments/max-salary")
    public String maxSalaryEmployee(@RequestParam("salary") int salary,
                                    @RequestParam("departmentId") int departmentId) {
        return employeeServiceimpl.maxSalaryEmployee(employee);
    }

    @GetMapping(path = "/departments/min-salary")
    public String minSalaryEmployee(@RequestParam("salary") int salary,
                                    @RequestParam("departmentId") int departmentId) {
        return employeeServiceimpl.minSalaryEmployee(employee);

    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment(@RequestParam("fullName") String fullName,
                                          @RequestParam("department") Integer department) {
        return employeeServiceimpl.allEmployeeInDepartment(employee);
    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment(@RequestParam("fullName") String fullName,
                                          @RequestParam("department") Integer department) {
       return employeeServiceimpl.allEmployeeDivisionByDepartment(employee);
    }

}
