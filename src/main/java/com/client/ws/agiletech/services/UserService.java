package com.client.ws.agiletech.services;

import com.client.ws.agiletech.dto.UserDto;
import com.client.ws.agiletech.exceptions.BadRequestException;
import com.client.ws.agiletech.exceptions.ResourceNotFoundExceptions;
import com.client.ws.agiletech.mapper.UserMapper;
import com.client.ws.agiletech.model.User;
import com.client.ws.agiletech.model.UserType;
import com.client.ws.agiletech.repositories.UserRepository;
import com.client.ws.agiletech.repositories.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    private Logger logger = Logger.getLogger(User.class.getName());

    public User create(UserDto dto){
        logger.info("creating User!");

        if(Objects.nonNull(dto.getId())){throw new BadRequestException("O id deve ser nulo");}

        var entityUserType = userTypeRepository.findById(dto.getUserTypeId())
                .orElseThrow(() -> new ResourceNotFoundExceptions("User type id not found!"));

        UserType userType = entityUserType;

        User user = UserMapper.dtoToEntity(dto, null, entityUserType);

        return userRepository.save(user);

    }
}
