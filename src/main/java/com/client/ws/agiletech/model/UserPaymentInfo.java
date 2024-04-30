package com.client.ws.agiletech.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "User_payment_info")
public class UserPaymentInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @OneToOne
    private Users user;


    public UserPaymentInfo() {
    }

    public UserPaymentInfo(Long id, String cardNumber, Long cardExpirationMonth, Long cardExpirationYear, String cardSecurityCode, BigDecimal price, LocalDate dtPayment, Users user) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.cardSecurityCode = cardSecurityCode;
        this.price = price;
        this.dtPayment = dtPayment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    public void setCardExpirationMonth(Long cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }

    public Long getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(Long cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDtPayment() {
        return dtPayment;
    }

    public void setDtPayment(LocalDate dtPayment) {
        this.dtPayment = dtPayment;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
