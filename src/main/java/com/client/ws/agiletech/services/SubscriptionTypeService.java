package com.client.ws.agiletech.services;

import com.client.ws.agiletech.exceptions.ResourceNotFoundExceptions;
import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.repositories.SubscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class SubscriptionTypeService {
    @Autowired
    private SubscriptionTypeRepository repository;

    private final Logger logger = Logger.getLogger(SubscriptionsType.class.getName());

    public List<SubscriptionsType> findAll(){
        logger.info("finding all subscriptions");

        return repository.findAll();
    }

    public Optional<SubscriptionsType> findById(Long id){
        logger.info("finding one subscription");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptions("Subscription not found"));

        return repository.findById(id);
    }

    public SubscriptionsType create(SubscriptionsType subscriptionsType){
        logger.info("creating one subscription");

        return repository.save(subscriptionsType);
    }

    public void delete(Long id){
        logger.info("deleting one subscription");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptions("Id not found, deleting impossible"));

        repository.delete(entity);
    }


}
