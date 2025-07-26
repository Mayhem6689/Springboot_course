package com.sit.harshit.repository;

import com.sit.harshit.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 //extends the jpa repository, jpa is used to add support for multiple databases( manages queries for multiple databases and saves time)
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

}
