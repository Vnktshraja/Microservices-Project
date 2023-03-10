package com.dev.user.service;

import com.dev.user.ValueObject.Department;
import com.dev.user.ValueObject.TemplateValueObject;
import com.dev.user.entity.MyUser;
import com.dev.user.entity.MyUser;
import com.dev.user.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    Logger log = LogManager.getLogger(UserService.class);

    @Autowired
    public RestTemplate restTemplate;

    @Autowired
    public UserRepository repo;
    public MyUser saveUser(MyUser user) {
        log.info("within saveUser() on the UserService class");
        return repo.save(user);

    }

    public List<MyUser> getAllUser() {
        log.info("within getAllUser() method of UserService class");
        return repo.findAll();
    }

    public MyUser getUserById(Long userId){
        log.info("Within getUserById() method of UserService class");
        return repo.findByUserId(userId);
    }

    public TemplateValueObject getUserWithDepartment(Long userId) {
        log.info("Within getUserWithDepartment() method of UserController class");
        TemplateValueObject vo = new TemplateValueObject();
        MyUser user = repo.findByUserId(userId);
        Department dp = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
        vo.setMyUser(user);
        vo.setDepartment(dp);
        return vo;
    }
}
