package com.sap.demo.controller;

//import com.sap.myproject1.Entity.User;
//import com.sap.myproject1.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
//    @Autowired
//    UserRepository userRepository;

//    Iterable<User> user;

    @RequestMapping("/hello")
    public String helloworld(){
        return "Hello shenjian";
    }

//    @RequestMapping("/user/Jay")
//    public String helloUser(){
//        String msg = "Hello";
//        user = userRepository.findAll();
//        for (User i : user) {
//            msg += i.getName();
//        }
//        return msg;
//    }
}
