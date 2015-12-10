/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Arnaud
 */
public class Order {
    
    private Integer number;
    private Date creationDate;
    private String status;
    private Customer customer;

    public Order(Integer number, Date creationDate, String status) {
        this.number = number;
        this.creationDate = creationDate;
        this.status = status;
    }
    
    public Order()
    {
        
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getClient() {
        return customer;
    }

    public void setClient(Customer idClient) {
        this.customer = idClient;
    }
    
    
    
}
