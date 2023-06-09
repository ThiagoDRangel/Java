package com.thiagoDRangel.dscommerce.repositories;

import com.thiagoDRangel.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
