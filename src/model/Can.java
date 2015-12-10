/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Arnaud
 */
public class Can {
    
    private Integer id;
    private String name;
    private String description; 
    private String brand;
    private double price;
    private boolean limitedEdition;
    private int capacity;
    private DrinkType drinktype;
    private String picture;
    private int stock;
    private HashMap <String, TraductionCan> tradCan;
   

    public Can(Integer id, String description, String brand, double price, boolean limitedEdition, int capacity) {
        this.id = id;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.limitedEdition = limitedEdition;
        this.capacity = capacity;
    }
    
    public Can(String name, String description, String brand, double price, boolean limitedEdition, int capacity) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.limitedEdition = limitedEdition;
        this.capacity = capacity;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    public DrinkType getDrinktype() {
        return drinktype;
    }

    public void setDrinktype(DrinkType drinktype) {
        this.drinktype = drinktype;
    }
    
    
    
    public Can ()
    {
        tradCan = new HashMap <> ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLimitedEdition() {
        return limitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        this.limitedEdition = limitedEdition;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<String, TraductionCan> getTradCan() {
        return tradCan;
    }

    public void setTradCan(HashMap<String, TraductionCan> tradCan) {
        this.tradCan = tradCan;
    }
    
    
    
    
}
