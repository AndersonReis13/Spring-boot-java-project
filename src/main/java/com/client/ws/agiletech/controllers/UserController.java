package com.client.ws.agiletech.controllers;

import com.client.ws.agiletech.dto.UserDto;
import com.client.ws.agiletech.model.User;
import com.client.ws.agiletech.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/agile/users" )
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<User> findById(@PathVariable(value = "id") Long id )throws Exception{
        return ResponseEntity.ok().body(userService.findById(id));
    }


    @PostMapping
    public ResponseEntity<User> create( @Valid @RequestBody UserDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(dto));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws Exception{
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }


}
