package com.client.ws.agiletech.repositories;

import com.client.ws.agiletech.model.SubscriptionsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionsType, Long> {

    /*@Query(("SELECT s.subscriptions_type_id, s.name, s.access_months, s.price, s.product_key FROM subscriptions_type s"))
    List<SubscriptionsType> FindAll();*/


}
