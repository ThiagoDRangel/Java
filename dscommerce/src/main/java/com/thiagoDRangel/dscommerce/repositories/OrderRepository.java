package com.thiagoDRangel.dscommerce.repositories;

import com.thiagoDRangel.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
