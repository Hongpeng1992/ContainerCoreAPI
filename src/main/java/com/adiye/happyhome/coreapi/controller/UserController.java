package com.adiye.happyhome.coreapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.adiye.happyhome.coreapi.model.User;
import com.adiye.happyhome.coreapi.service.users.UserService;

/**
 * Created by nyeluri on 11/15/16.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Qualifier("UserServiceImpl")
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(
        @RequestBody User user){

        userService.createUser(user);
    }

    @RequestMapping(path="/{userId}", method = RequestMethod.GET)
    public @ResponseBody User getUser(
        @PathVariable(value = "userId") Long userId){
        return userService.getUser(userId);
    }

    @RequestMapping(path="/{userId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(
        @PathVariable(value = "userId") Long userId){
        userService.deleteUser(userId);
    }
}
