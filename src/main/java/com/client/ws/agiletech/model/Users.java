package com.client.ws.agiletech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @ManyToOne(fetch = FetchType.LAZY)
    private UserType userType;


    @JoinColumn(name = "subscriptions_type_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SubscriptionsType subscriptionsType;


}
