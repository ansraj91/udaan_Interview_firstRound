package com.Controller;

import com.model.Entity.RegistrationInfo;
import com.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController("/user")

public class RegisterUser {

    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(RegistrationInfo registrationInfo){
        long id = userRegistrationService.registerUser(registrationInfo,registrationInfo.getType());
        return new ResponseEntity<>("{userid:"+id+"}", HttpStatus.ACCEPTED);

    }

}
