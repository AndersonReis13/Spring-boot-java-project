package com.client.ws.agiletech.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;


@Entity
@Table(name = "tb_UserType")
public class UserType implements Serializable    {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_type_id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    public UserType() {
    }

    public UserType(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
