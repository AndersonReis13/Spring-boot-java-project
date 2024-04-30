package com.client.ws.agiletech.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String cpf;

    @Column(name = "dt_subscription", nullable = false)
    private LocalDate dtSubscription = LocalDate.now();

    @Column(name = "dt_Expiration", nullable = false)
    private LocalDate dtExpiration;

    @JoinColumn(name = "User_type_id")
    @ManyToOne
    private UserType userType;


    @JoinColumn(name = "subscriptions_type_id")
    @ManyToOne
    private SubscriptionsType subscriptionsType;

    public Users(){
    }

    public Users(Long id, String name, String email, String phone, String cpf, LocalDate dtSubscription, LocalDate dtExpiration, UserType userType, SubscriptionsType subscriptionsType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
        this.dtSubscription = dtSubscription;
        this.dtExpiration = dtExpiration;
        this.userType = userType;
        this.subscriptionsType = subscriptionsType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public SubscriptionsType getSubscriptionsType() {
        return subscriptionsType;
    }

    public void setSubscriptionsType(SubscriptionsType subscriptionsType) {
        this.subscriptionsType = subscriptionsType;
    }
}
