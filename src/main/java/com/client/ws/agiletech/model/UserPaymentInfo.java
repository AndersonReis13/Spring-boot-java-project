package com.client.ws.agiletech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User_payment_info")
public class UserPaymentInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_payment_info_id")
    private Long id;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;
    @Column(name = "card_expiration_month", nullable = false)
    private Long cardExpirationMonth;

    @Column(name = "card_expiration_year", nullable = false)
    private Long cardExpirationYear;

    @Column(name = "card_security_code", nullable = false)
    private String cardSecurityCode;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "dt_payment", nullable = false)
    private LocalDate dtPayment;


    @PrimaryKeyJoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Users user;



}
