package com.alinso.stok.service;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AuthService {

    @PostMapping("/check-login")
    public String checkLogin(){
        return "OK";
    }
}
