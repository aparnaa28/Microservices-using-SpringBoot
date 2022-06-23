package com.Microservices.departmentservice.service;
import com.Microservices.departmentservice.entity.Department;
import com.Microservices.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department d) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(d);
    }

    public Department findByIdDepartment(Long departmentId) {
        log.info("Inside findByIdDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
