package com.client.ws.agiletech.repositories;

import com.client.ws.agiletech.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentRepository extends JpaRepository<UserPaymentInfo, Long> {
}
