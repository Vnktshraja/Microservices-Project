package com.dev.department.service;

import com.dev.department.entity.Department;
import com.dev.department.repository.DepartmentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    Logger log = LogManager.getLogger(Department.class);

    @Autowired
    public DepartmentRepository repo;

    public Department saveDepartment(Department department) {
        log.info("within saveDepart method on DepartService class");
        return repo.save(department);
    }



    public Department getDepartmentById(Long departmentId) {
        log.info("within GetDepartmentById method on DepartService class");
       return repo.findByDepartmentId(departmentId);

    }

    public List<Department> findAllDepartment() {
        log.info("within findAllDepartment() method on DepartService class");
        return repo.findAll();
    }
}
