package com.example.skyprostreamapioptionalhw.controller;

import com.example.skyprostreamapioptionalhw.model.Employee;
import com.example.skyprostreamapioptionalhw.service.DepartmentService;
import com.example.skyprostreamapioptionalhw.service.DepartmentServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/departments/max-salary")
    public String maxSalaryEmployee(@RequestParam("departmentId") Integer departmentId) {
        return maxSalaryEmployee(departmentId);
    }

    @GetMapping(path = "/departments/min-salary")
    public String minSalaryEmployee(@RequestParam("departmentId") Integer departmentId) {
        return minSalaryEmployee(departmentId);

    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment(@RequestParam("departmentId") Integer departmentId) {

        return allEmployeeInDepartment();
    }

    @GetMapping(path = "/departments/all")
    public String allEmployeeInDepartment() {

        return allEmployeeInDepartment();
    }
}
