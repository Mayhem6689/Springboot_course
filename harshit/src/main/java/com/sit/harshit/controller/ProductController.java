package com.sit.harshit.controller;

import com.sit.harshit.entity.ProductEntity;
import com.sit.harshit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<ProductEntity> getProducts(){
        return service.getProducts();
    }

    @PostMapping("/products")
    public String addProducts(@RequestBody ProductEntity product){
        return service.addProduct(product);
    }

    @PutMapping("/product/{id}")
    public String editProducts(@PathVariable int id, @RequestBody ProductEntity product){
        return service.editProduct(id, product);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
    //change application.properties in "resources" folder for database configuration
}