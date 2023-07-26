package com.example.First.Controller;

import com.example.First.DTO.LoginReq;
import com.example.First.DTO.LoginResponse;
import com.example.First.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private LoginService loginService;

    //private LoginService loginService;
    @PostMapping("/addDetails")
    public LoginResponse Details(@RequestBody LoginReq loginReq){
        //EmployeeResponse employeeResponse = employeeService.employeeDetails(employeeRequest);
        return loginService.details(loginReq);
    }
}
