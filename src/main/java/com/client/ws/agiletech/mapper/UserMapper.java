package com.client.ws.agiletech.mapper;

import com.client.ws.agiletech.dto.UserDto;
import com.client.ws.agiletech.model.SubscriptionsType;
import com.client.ws.agiletech.model.User;
import com.client.ws.agiletech.model.UserType;

public class UserMapper {

    public static User dtoToEntity(UserDto dto, SubscriptionsType subscriptionsType, UserType userType){
        return User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .cpf(dto.getCpf())
                .dtExpiration(dto.getDtExpiration())
                .dtSubscription(dto.getDtSubscription())
                .userType(userType)
                .subscriptionsType(subscriptionsType)
                .build();
    }
}
