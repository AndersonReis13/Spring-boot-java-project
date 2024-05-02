package com.client.ws.agiletech.repositories;

import com.client.ws.agiletech.model.SubscriptionsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionsType, Long> {
}
