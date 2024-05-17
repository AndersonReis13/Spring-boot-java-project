package com.client.ws.agiletech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long userId;

    @NotBlank(message = "name not null or empty")
    @Size(min = 5, message = "min value 5 to name")
    private String name;

    @Email(message = "invalid")
    private String email;

    @Size(min = 11, message = "min value 11")
    private String phone;

    @CPF(message = "invalid")
    private String cpf;

    private LocalDate dtSubscription = LocalDate.now();

    private LocalDate dtExpiration = LocalDate.now();

    @NotNull
    private Long userTypeId;

    private Long subscriptionsTypeId;

}
