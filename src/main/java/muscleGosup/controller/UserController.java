package muscleGosup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import muscleGosup.service.UserService;


@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/get/user/auth")
    public ResponseEntity<Object> getUser(){
        try {
            return ResponseEntity.ok().body(userService.getAuthenticatedUserRestricted());
        } catch(IllegalAccessException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
    
}
