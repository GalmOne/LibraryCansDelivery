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
public class DrinkType {
    
    private short id;
    private HashMap <String, TraductionDrinkType> traductionType;
    

    
    public DrinkType()
    {
        
    }

    public HashMap<String, TraductionDrinkType> getTraductionType() {
        return traductionType;
    }

    public void setTraductionType(HashMap<String, TraductionDrinkType> traductionType) {
        this.traductionType = traductionType;
    }
    
    

    

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }
    
    
    
    
}
