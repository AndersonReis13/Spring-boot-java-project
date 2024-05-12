package com.client.ws.agiletech.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
@JsonPropertyOrder({"id", "name", "acess_months", "price", "product_key"})
public class SubscriptionsType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(value = "id")
    private Long subscriptionsTypeId;
    
    private String name;

    @Column( name = "access_months")
    private Integer accessMonths;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;

}
