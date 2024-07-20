package com.JavaApplication.BusReservationSystem.Service;

import com.JavaApplication.BusReservationSystem.Entity.UserData;
import com.JavaApplication.BusReservationSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserData saveUserData(UserData userData){
        return userRepository.save(userData);
    }

}
