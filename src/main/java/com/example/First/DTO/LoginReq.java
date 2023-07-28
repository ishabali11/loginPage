package com.example.First.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginReq {

@JsonProperty
public String email;


    @JsonProperty
    public String username;

    @JsonProperty
    public String password;


}
