package com.client.ws.agiletech.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class SubscriptionsTypeDto{

    private Long subscriptionsTypeId;

    @NotBlank(message = "name is not null and empty")
    @Size(min = 5, max = 30)
    private String name;

    @Max(value = 12, message = "access months is cant bigger than 12")
    private Integer accessMonths;

    @NotNull(message = "price is not null")
    private BigDecimal price;

    @NotBlank(message = "product key is nor null and empty" )
    @Size(min = 5, max = 15)
    private String productKey;

}
