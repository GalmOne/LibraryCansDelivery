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
public class Customer {
    
    private Integer id;
    private String name;
    private String firstname;
    private String login;
    private String password;
    private Date birthdate;
    private String email;
    private String gsm;     //pour les 10a 10b ...
    private String number;
    private String street;
    private int posteCode;
    private String city;
    private String country;
    
    
     public Customer ()
    {
        
    }
    
    public Customer(String name, String firstname, String login, String password, Date birthdate, String email, String gsm, String number, String street, int posteCode, String city) {
        this.name = name;
        this.firstname = firstname;
        this.login = login;
        this.password = password;
        this.birthdate = birthdate;
        this.email = email;
        this.gsm = gsm;
        this.number = number;
        this.street = street;
        this.posteCode = posteCode;
        this.city = city;
    }

    public Customer(Integer id, String name, String firstname, String login, String password, Date birthdate, String email, String gsm, String number, String street, int posteCode, String city) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.login = login;
        this.password = password;
        this.birthdate = birthdate;
        this.email = email;
        this.gsm = gsm;
        this.number = number;
        this.street = street;
        this.posteCode = posteCode;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPosteCode() {
        return posteCode;
    }

    public void setPosteCode(int posteCode) {
        this.posteCode = posteCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    


    
}
