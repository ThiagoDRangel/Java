package com.thiagoDRangel.dscommerce.controllers;

import com.thiagoDRangel.dscommerce.dto.ProductDTO;
import com.thiagoDRangel.dscommerce.entities.Product;
import com.thiagoDRangel.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;
    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
      return service.findById(id);
    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public ProductDTO insert(@RequestBody ProductDTO dto) {
        return service.insert(dto);
    }
}