package com.example.First.Controller;

import com.example.First.DTO.LoginReq;
import com.example.First.DTO.LoginResponse;
import com.example.First.Entity.Logintable;
import com.example.First.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
@GetMapping("/LoginPage")
public String show(){
    return "LoginPage";

}
@GetMapping("SignUp")
public String enter(){
    return "SignUp";
}



    @Autowired
    private LoginService loginService;

    //private LoginService loginService;
    @PostMapping("/login")

    public String Details(@RequestParam("username") String username, @RequestParam("password") String password) {


        // public LoginResponse Details(@RequestBody LoginReq loginReq){
        //EmployeeResponse employeeResponse = employeeService.employeeDetails(employeeRequest);
        return loginService.details(username,password);


    }
    @PostMapping("/signup")
    public String create(@RequestParam("username") String username,@RequestParam("password")String password)
    {
        return loginService.create(username,password);
    }
}
