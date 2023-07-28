package com.example.First.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity

@Table(name="logintable")
public  class Logintable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;


    @Column(name="email")
    private String email;

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   // public Logintable findByUsername(String username1) {
     //   return username;
  //  }
    }



