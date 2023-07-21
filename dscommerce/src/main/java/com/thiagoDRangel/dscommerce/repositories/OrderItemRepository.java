package com.thiagoDRangel.dscommerce.repositories;

import com.thiagoDRangel.dscommerce.entities.OrderItem;
import com.thiagoDRangel.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
