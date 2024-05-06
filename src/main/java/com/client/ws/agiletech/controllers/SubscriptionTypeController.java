package com.client.ws.agiletech.controllers;

import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.repositories.SubscriptionTypeRepository;
import com.client.ws.agiletech.services.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/agile/subscription")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeService service;

    @GetMapping
    public List<SubscriptionsType> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "{id}")
    public Optional<SubscriptionsType> findById(@PathVariable(value = "id") String id) throws Exception{
        return service.findById(Long.valueOf(id));
    }

}
