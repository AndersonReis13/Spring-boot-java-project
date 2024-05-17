package com.client.ws.agiletech.services;

import com.client.ws.agiletech.exceptions.ResourceNotFoundExceptions;
import com.client.ws.agiletech.model.UserPaymentInfo;
import com.client.ws.agiletech.repositories.UserPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserPaymentService {

    @Autowired
    private UserPaymentRepository repository;

    private Logger logger = Logger.getLogger(UserPaymentInfo.class.getName());

    public List<UserPaymentInfo> findAll(){
        logger.info("Finding all userpayments!");

        return repository.findAll();
    }

    public UserPaymentInfo findById(Long id){
        logger.info("finding one userpayment!");

        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundExceptions("payment not found!"));

    }

}
