package com.client.ws.agiletech.mapper;

import com.client.ws.agiletech.dto.SubscriptionsTypeDto;
import com.client.ws.agiletech.model.SubscriptionsType;

public class SubscriptionTypeMapper {

    public static SubscriptionsType dtoToEntity(SubscriptionsTypeDto dto){
        return SubscriptionsType.builder()
                .subscriptionsTypeId(dto.getSubscriptionsTypeId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonths())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
