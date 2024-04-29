package com.client.ws.agiletech.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionsType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column( name = "acess_month",nullable = false)
    private Integer acessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;

    public SubscriptionsType() {
    }

    public SubscriptionsType(Long id, String name, Integer acessMonth, BigDecimal price, String productKey) {
        this.id = id;
        this.name = name;
        this.acessMonth = acessMonth;
        this.price = price;
        this.productKey = productKey;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAcessMonth() {
        return acessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcessMonth(Integer acessMonth) {
        this.acessMonth = acessMonth;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
