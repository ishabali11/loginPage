package com.example.First.Service;

import com.example.First.DTO.LoginReq;
import com.example.First.DTO.LoginResponse;
import com.example.First.Entity.Logintable;
import com.example.First.Repository.LoginRepo;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepo loginRepo;


    public LoginResponse details( LoginReq loginReq) {
        LoginResponse loginResponse = new LoginResponse();
        // LoginReq loginReq1 = new LoginReq();
     String username1 = loginReq.username;
        String password1 = loginReq.password;

        Logintable logintable = loginRepo.findByUsername(username1);
       // Logintable logintable = LoginRepo.findByPassword(password1);


       // Logintable logintable = new Logintable();


        if (logintable.getUsername().equals(username1)) {
            if (logintable.getPassword().equals(password1)) {
                loginResponse.message = "Login Successful";

            } else {
                loginResponse.message = "Login failed, invalid password";

            }
        } else {
            loginResponse.message = "Login failed, invalid username";

        }
        return loginResponse;
    }


        }


