package com.sit.harshit.service;

import com.sit.harshit.entity.ProductEntity;
import com.sit.harshit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<ProductEntity> getProducts(){
        return repo.findAll();
    }

    public String addProduct(ProductEntity product){
        repo.save(product);
        return "Added "+product+" successfully";
    }

    public String editProduct(int id, ProductEntity updatedProduct){
        if (repo.findById(id).isEmpty()){
            return "Product with id: "+ id +" is not available";
        }
        else {
            ProductEntity p = repo.findById(id).get();
            p.setName(updatedProduct.getName());
            p.setPrice(updatedProduct.getPrice());
            p.setCategory(updatedProduct.getCategory());
            repo.save(p);
            return "Product with id: "+ id +" Updated successfully";
        }
    }

    public String deleteProduct(int id){
        if (repo.findById(id).isEmpty()){
            return "Product with id: "+ id +" is not available";
        }
        else{
            ProductEntity p = repo.findById(id).get();
            repo.delete(p);
            return "Product with id: "+ id +" Deleted successfully";
        }
    }
}