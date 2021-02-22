/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class VitalSigns {
    
    private String name;
    private float age;
    private int rate;
    private int heart;
    private int pressure;
    private float kilos;
    private float pounds;
    private String date;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(float age) {
        this.age = age;
    }
    
    public float getAge() {
        return age;
    }
    
    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public int getRate() {
        return rate;
    }
    
    public void setHeart(int heart) {
        this.heart = heart;
    }
    
    public int getHeart() {
        return heart;
    }
    
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    
    public int getPressure() {
        return pressure;
    }
    
    public void setKilos(float kilos) {
        this.kilos = kilos;
    }
    
    public float getKilos() {
        return kilos;
    }
    
    public void setPounds(float pounds) {
        this.pounds = pounds;
    }
    
    public float getPounds() {
        return pounds;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String data) {
        this.date = date;
    }
    
}
