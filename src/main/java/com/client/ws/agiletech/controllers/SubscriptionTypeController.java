package com.client.ws.agiletech.controllers;

import com.client.ws.agiletech.dto.SubscriptionsTypeDto;
import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.services.SubscriptionTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/agile/subscription")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeService service;

    @GetMapping
    public ResponseEntity<List<SubscriptionsType>> findAll(){
        return ResponseEntity.ok().body( service.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<SubscriptionsType> findById(@PathVariable(value = "id") Long id) throws Exception{
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionsType> create(@RequestBody  @Valid SubscriptionsTypeDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<SubscriptionsType> update(@PathVariable(value = "id") Long id, @RequestBody SubscriptionsTypeDto dto){
        return ResponseEntity.ok().body(service.update(dto, id));
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
            service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

}
