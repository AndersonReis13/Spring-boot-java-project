package com.client.ws.agiletech.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionsTypeDto implements Serializable {
    private Long subscriptionsTypeId;

    private String name;

    private Integer accessMonth;

    private BigDecimal price;

    private String productKey;
}
