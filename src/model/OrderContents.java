/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arnaud
 */
public class OrderContents {
    
    private Can can;
    private int quantity;
    private double price;
    private Order order;

    public OrderContents(Can can, Order order) {
        this.can = can;
        this.quantity = 1;
        this.order = order;
        this.price = quantity * can.getPrice();
    }

    public OrderContents(Can can, int quantity, double price, Order order) {
        this.can = can;
        this.quantity = quantity;
        this.price = price;
        this.order = order;
    }
    
    

    public OrderContents() {
    }

    public Can getCan() {
        return can;
    }

    public void setCan(Can can) {
        this.can = can;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
    
    
}
