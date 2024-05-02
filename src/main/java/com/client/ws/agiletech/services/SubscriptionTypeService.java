package com.client.ws.agiletech.services;

import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.repositories.SubscriptionTypeRepository;
import org.hibernate.sql.exec.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class SubscriptionTypeService {
    @Autowired
    private SubscriptionTypeRepository repository;

    private final Logger logger = Logger.getLogger(SubscriptionsType.class.getName());

    public List<SubscriptionsType> FindAll(){
        logger.info("finding all subscriptions");

        return repository.findAll();
    }

    public SubscriptionsType findById(Long id){
        logger.info("finding one subscription");

        return null;
    }

    public SubscriptionsType create(SubscriptionsType subscriptionsType){
        logger.info("creating one subscription");

        return null;
    }

    public void delete(Long id){
        logger.info("deleting one subscription");


    }


}
