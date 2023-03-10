package com.dev.department.controller;

import com.dev.department.entity.Department;
import com.dev.department.service.DepartmentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.logging.log4j.Logger.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    Logger log = LogManager.getLogger(Department.class);

    @Autowired
    DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment( @RequestBody Department department){
        log.info("within saveDepartment method of DepartController");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable ("id") Long departmentId){
        log.info("within saveDepartment method of DepartController");
        return service.getDepartmentById(departmentId);
    }

    @GetMapping("/getAll")
    public List<Department> getAllDepartment(){

        return service.findAllDepartment();
    }


    }
