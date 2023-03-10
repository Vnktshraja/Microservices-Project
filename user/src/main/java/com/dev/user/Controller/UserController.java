package com.dev.user.Controller;


import com.dev.user.ValueObject.TemplateValueObject;
import com.dev.user.entity.MyUser;
import com.dev.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    public UserService service;

    @PostMapping("/")
    public MyUser saveUser(@RequestBody MyUser user){
        log.info("within saveUser() method on the User Controller");
        return service.saveUser(user);
    }

    @GetMapping("/getUsers")
    public List<MyUser> getAll(){
        log.info("Within getAll() method of UserController class");
        return service.getAllUser();
    }

    @GetMapping("/single/{id}")
    public MyUser getUserById(@PathVariable ("id") Long userId){
        log.info("Within getUserById() method of UserController class");
        return service.getUserById(userId);
    }

    @GetMapping("/{id}")
    public TemplateValueObject getUserWithdepartment(@PathVariable("id") Long userId){

        return service.getUserWithDepartment(userId);
    }

}
