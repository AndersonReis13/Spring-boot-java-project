package com.client.ws.agiletech.controllers;

import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.services.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public SubscriptionsType findById(@PathVariable(value = "id") String id) throws Exception{
        return service.findById(Long.valueOf(id));
    }

    @PostMapping
    public SubscriptionsType create(@RequestBody SubscriptionsType subscriptionsType){
        return service.create(subscriptionsType);
    }

}
