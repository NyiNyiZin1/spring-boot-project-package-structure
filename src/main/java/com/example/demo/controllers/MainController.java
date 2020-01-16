package com.example.demo.controllers;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.User;
import com.example.demo.entities.UserHistory;
import com.example.demo.utilities.TempStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController extends CloneNotSupportedException{

    @Autowired
    TempStore tempStore;

    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable int id) throws Exception {
        User user = tempStore.getUser(id);
        return new UserDto(user);
    }

    @PutMapping("/user")
    public String saveUser(@RequestBody UserDto userDto) throws Exception {
        User originalUser = tempStore.getUser(userDto.getId());
        User toSaveUser = userDto.toEntity(originalUser);
        tempStore.saveHistory(toSaveUser.createHistory("Modify"));//tempStore.saveHistory(entity.class);
        tempStore.modifyUser(toSaveUser);
        return "success";
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user) throws CloneNotSupportedException {
        tempStore.addNewUser(user);
        UserDto userDto = new UserDto(user);
        tempStore.saveHistory(user.createHistory("Added"));
        return "Success";
    }

    @GetMapping("/user/{id}/histories")
    public List<UserHistory> getUserHistories(@PathVariable int id){
        return tempStore.getUserHistory(id);
    }

}
