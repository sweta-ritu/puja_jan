package com.travelbnb.service;

import com.travelbnb.entity.AppUser;
import com.travelbnb.repository.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private AppUserRepository appUserRepository;

    public UserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

//    private JWTService jwtService;

//    public UserService(AppUserRepository appUserRepository, JWTService jwtService) {
//        this.appUserRepository = appUserRepository;
//        this.jwtService = jwtService;
//    }

    public AppUser createUser(AppUser user){


//        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(10)));
        AppUser createdUser = appUserRepository.save(user);
        return createdUser;

    }

//    public String verifyLogin(LoginDto loginDto) {
//        Optional<AppUser> opUserName = appUserRepository.findByUsername(loginDto.getUsername());
//        if(opUserName.isPresent()){
//            AppUser appUser = opUserName.get();//this data is comming to database
//            if( BCrypt.checkpw(loginDto.getPassword(),appUser.getPassword())){//this line of code to check the password
//                String token = jwtService.generateToken(appUser);//when the password is matches in appUser
//                return token;
//            }
//
//
//        }
//        return null;//password is not equal return null
//    }

}
