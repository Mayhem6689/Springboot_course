package com.sit.harshit.entity;

// This class will represent DB Table
// Requires JPA ( Java Persistence API ) and MySQL Dependencies


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
Lombok is used to create all the getters and setters without the need of generate command(rightclick and generate code)
*/

@Entity
public class ProductEntity {

    @Id   // Helps to generate a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Column of Tables in DB
    private int id;
    private String name;
    private int price;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}