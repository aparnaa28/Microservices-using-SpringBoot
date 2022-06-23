package com.Microservices.departmentservice.controller;

import com.Microservices.departmentservice.entity.Department;
import com.Microservices.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department d)
    {
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(d);
    }

    @GetMapping("/{id}")
    public Department findByIdDepartment(@PathVariable("id") Long departmentId)
    {
        log.info("inside findByIdDepartment method of DepartmentController");
        return departmentService.findByIdDepartment(departmentId);
    }
}


