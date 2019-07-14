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
public class Reservation implements Serializable{
    @Id @GeneratedValue
    int resev_No;
    
    int reg_No;
    int res_No;
    String date;
    String time;

    public Reservation() {
    }

    public int getResev_No() {
        return resev_No;
    }

    public void setResev_No(int resev_No) {
        this.resev_No = resev_No;
    }

    public int getReg_No() {
        return reg_No;
    }

    public void setReg_No(int reg_No) {
        this.reg_No = reg_No;
    }

    public int getRes_No() {
        return res_No;
    }

    public void setRes_No(int res_No) {
        this.res_No = res_No;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
