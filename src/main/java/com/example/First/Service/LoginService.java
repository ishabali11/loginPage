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


    public String details(String username, String password) {

        LoginResponse loginResponse = new LoginResponse();
        // LoginReq loginReq1 = new LoginReq();
        // String username1 = loginReq.username;
        //  String password1 = loginReq.password;

        //String username ;
        Logintable logintable = loginRepo.findByUsername(username);
        // Logintable logintable = LoginRepo.findByPassword(password1);
        // Logintable logintable = new Logintable();

        if (logintable.getUsername().equals(username)) {
            if (logintable.getPassword().equals(password)) {
                loginResponse.message = "Login Successful";
                return "Succesful";

            } else {
                loginResponse.message = "Login failed, invalid password";
                return "Unsucessful";

            }
        } else {
            loginResponse.message = "Login failed, invalid username";
            //   return "Unsucessful";

        }
        return "a";
    }

    public String create(String username, String password) {
        Logintable logintable = new Logintable();

        logintable.setUsername(username);
        // logintable.setEmail(email);
        logintable.setPassword(password);

        loginRepo.save(logintable);
        return "LoginPage";


    }



        }


