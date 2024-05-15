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

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    private Logger logger = Logger.getLogger(User.class.getName());


    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptions("User id not found!"));
    }

    public User create(UserDto dto){
        logger.info("creating User!");

        if(Objects.nonNull(dto.getId())){throw new BadRequestException("this id is null");}

        var entityUserType = userTypeRepository.findById(dto.getUserTypeId())
                .orElseThrow(() -> new ResourceNotFoundExceptions("User type id not found!"));

        UserType userType = entityUserType;

        User user = UserMapper.dtoToEntity(dto, null, userType);

        return userRepository.save(user);

    }

    public User update(UserDto dto, Long id){
        var entity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptions("User id not found!"));

        var entityType = userTypeRepository.findById(dto.getUserTypeId())
                .orElseThrow(() -> new ResourceNotFoundExceptions("User type id not found!"));

        dto.setId(id);
        UserType userType = entityType;

        User user = UserMapper.dtoToEntity(dto, null, userType);

        return userRepository.save(user);
    }

    public void delete(Long id){
        logger.info("deleting one user");

        var entity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptions("User id not found!"));

        userRepository.delete(entity);
    }
}
