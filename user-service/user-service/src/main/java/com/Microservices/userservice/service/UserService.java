package com.Microservices.userservice.service;

import com.Microservices.userservice.VO.Department;
import com.Microservices.userservice.VO.ResponseTemplateVO;
import com.Microservices.userservice.entity.UserEntity;
import com.Microservices.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity user) {
        log.info("Inside saveUser of userService");
        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserWithDepartment(Long userId) {

        log.info("Inside getUserWithDepartment of userService");
        ResponseTemplateVO vo=new ResponseTemplateVO();
        UserEntity user= userRepository.findByUserId(userId);

        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+
                user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
