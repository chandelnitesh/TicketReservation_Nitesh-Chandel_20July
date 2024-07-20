package com.JavaApplication.BusReservationSystem.Controller;

import com.JavaApplication.BusReservationSystem.Entity.UserData;
import com.JavaApplication.BusReservationSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("save/userDetails")
    public UserData saveUserData(@RequestBody UserData userData){
        return userService.saveUserData(userData);
    }
}
