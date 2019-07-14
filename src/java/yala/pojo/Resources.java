/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yala.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sachithre
 */
@Entity
public class Resources implements Serializable{
    
    @Id @GeneratedValue
    int reso_No;
    
    String description;
    String authPerson;
    String type;
    int maxCount;
    float charges;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public Resources() {
    }

    
    public int getReso_No() {
        return reso_No;
    }

    public void setReso_No(int reso_No) {
        this.reso_No = reso_No;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthPerson() {
        return authPerson;
    }

    public void setAuthPerson(String authPerson) {
        this.authPerson = authPerson;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }




    public float getCharges() {
        return charges;
    }

    public void setCharges(float charges) {
        this.charges = charges;
    }
    
    
    
}
