package com.sit.harshit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sit.harshit.service.HarshitService;

import jakarta.websocket.server.PathParam;

@RestController //Controller is used to make a REST API Controller class which is used to implement GetMapping, Postmapping
public class HarshitController {
@Autowired
private HarshitService service;// Dependency Injection is the addition of service layer so that business logic can be added seperately to the service layer
// this step signifies dependency injection through HarshitService

@GetMapping("/")
public String getMessage() {
	return "hello from Spring";
}
/*
@GetMapping("/products")
public List<String> getProducts(){
	return List.of("Laptop","Mobile");
}
@PostMapping("/products")
public String addProduct(@RequestBody String product) {
	return "Product added: " + product;
}
Static api calls
*/


//Dynamic Api Calls
@GetMapping("/products")
public List<String> getProducts(){
	return service.getProducts();
}
@PostMapping("/products")
public String addProduct(@RequestBody String product) {
	return service.addProducts(product); //uses service layer to add an API Call using service logic
}
@DeleteMapping("/products/{name}")//placeholder {} is used to signify that the specific product entered will be deleted
public String deleteProduct(@PathVariable String name) {
	return service.deleteProduct(name);
}



}