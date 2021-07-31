package com.service;

import com.dao.UserZoneDao;
import com.model.Entity.RegistrationInfo;
import com.model.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class UserRegistrationService {

    @Autowired
    private UserZoneDao userZoneDao;

    public long registerUser(RegistrationInfo registrationInfo, String type){
        if(userZoneDao.getUser(registrationInfo.getPhoneNo())==null){
           // userZone.add
            return userZoneDao.addUserRegistration(new User("pass",USER_TYPE.ADMIN.toString()));
        }else{
            return -1;
        }
    }



    // checking if user exit using contact number -- >> registration
    // if not Exist -> user (new (dummy, type))
}
