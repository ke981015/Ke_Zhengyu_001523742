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
public class Encounter extends VitalSigns{
    
    private int year;
    private int month;
    private int date;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public Encounter(int year, int month, int date, int rate, int heart, int pressure, float kilos, float pounds){
        super(rate, heart, pressure, kilos, pounds);
        this.year = year;
        this.month = month;
        this.date = date;
    }
     
}
