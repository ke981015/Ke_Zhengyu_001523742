/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Patient extends Person{
    
    Encounter encounter = new Encounter(0,0,0,0,0,0,0,0); 
    static ArrayList<Patient> patientdirectory = new ArrayList<Patient>();
    
    public void addNewPatient(Patient s){
        patientdirectory.add(s);
    }
    
    public Patient(String name, float age, int year, int month, int date, int rate, int heart, int pressure, float kilos, float pounds){
        super(name, age);
        encounter.setYear(year);
        encounter.setMonth(month);
        encounter.setDate(date);
        encounter.setRate(rate);
        encounter.setHeart(heart);
        encounter.setPressure(pressure);
        encounter.setKilos(kilos);
        encounter.setPounds(pounds);
    }
    
    public static void staticmethod(Patient s){
        for(;;){
            s.SavePatient();
            boolean normal;
            String vs;
            Scanner input = new Scanner(System.in);
            System.out.println("please input the vital sign:");
            vs = input.nextLine();
                for(;;){
                    normal = s.isThisVitalSignNormal(vs);       
                    if(normal)
                        System.out.println("normal");
                    System.out.println("please input the vital sign:(input done to end)");
                    vs = input.nextLine();
                    if(vs.equals("done"))
                        break;                
                }        
            s.output();
            s.Clear();
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Patient patient = new Patient("null",0,0,0,0,0,0,0,0,0);
        staticmethod(patient);
    }
    
    public void SavePatient(){
        Scanner input = new Scanner(System.in);
        System.out.println("please input the name and age:");
        setName(input.nextLine());
        setAge(input.nextFloat());
        System.out.println("please input the date(year, month, date):");
        encounter.setYear(input.nextInt());
        encounter.setMonth(input.nextInt());
        encounter.setDate(input.nextInt());
    }
    
    public void Clear(){
        encounter.setRate(0);
        encounter.setHeart(0);
        encounter.setPressure(0);
        encounter.setKilos(0);
        encounter.setPounds(0);
    }
    
    public void output(){
        Patient patient = new Patient(getName(),getAge(),encounter.getYear(),encounter.getMonth(),encounter.getDate(),encounter.getRate(),encounter.getHeart(),encounter.getPressure(),encounter.getKilos(),encounter.getPounds());
        addNewPatient(patient);
        for(Patient p : patientdirectory) {
            System.out.println(p);
        }
    }
    
    public boolean isThisVitalSignNormal(String s){       
            Scanner input = new Scanner(System.in);
            if(s.equals("respiratory rate")){
                System.out.println("please input the respiratory rate:"); 
                System.out.println("(respiratory on infants should be counted for a full 60 seconds)");
                encounter.setRate(input.nextInt());
                if(getAge()>0&&getAge()<=0.1){
                    if(encounter.getRate()<30)              
                        System.out.println("abnormal respiratory rate"); 
                    else if(encounter.getRate()>50){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>0.1&&getAge()<=1){
                    float infantrate = encounter.getRate()/60;
                    if(infantrate<(1/3))                  
                        System.out.println("abnormal respiratory rate"); 
                    else if(infantrate>0.5){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>1&&getAge()<=3){
                    if(encounter.getRate()<20)                  
                        System.out.println("abnormal respiratory rate"); 
                    else if(encounter.getRate()>30){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>3&&getAge()<6){
                    if(encounter.getRate()<20)                 
                        System.out.println("abnormal respiratory rate");  
                    else if(encounter.getRate()>30){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>=6&&getAge()<13){
                    if(encounter.getRate()<20)                 
                        System.out.println("abnormal respiratory rate"); 
                    else if(encounter.getRate()>30){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>=13){
                    if(encounter.getRate()<12)                  
                        System.out.println("abnormal respiratory rate"); 
                    else if(encounter.getRate()>20){
                        System.out.println("abnormal respiratory rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else
                    System.out.println("please cheak your input");           
            }
            else if(s.equals("heart rate")){
                System.out.println("please input the heart rate:"); 
                encounter.setHeart(input.nextInt());
                if(getAge()>0&&getAge()<=0.1){
                    if(encounter.getHeart()<120){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>160){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>0.1&&getAge()<=1){
                    if(encounter.getHeart()<80){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>140){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>1&&getAge()<=3){
                    if(encounter.getHeart()<80){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>130){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>3&&getAge()<6){
                    if(encounter.getHeart()<80){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>120){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>=6&&getAge()<13){
                    if(encounter.getHeart()<70){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>110){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else if(getAge()>=13){
                    if(encounter.getHeart()<55){
                        System.out.println("abnormal heart rate");
                        System.out.println("!!!bradycardia!!!"); 
                    }
                    else if(encounter.getHeart()>105){
                        System.out.println("abnormal heart rate"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else
                        return true;
                }
                else
                    System.out.println("please cheak your input"); 
            }
            else if(s.equals("systolic blood pressure")){
                System.out.println("please input the systolic blood pressure:"); 
                encounter.setPressure(input.nextInt());
                if(getAge()>0&&getAge()<=0.1){
                    if(encounter.getPressure()<50)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>70){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }                              
                }
                else if(getAge()>0.1&&getAge()<=1){
                    if(encounter.getPressure()<70)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>100){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }
                }
                else if(getAge()>1&&getAge()<=3){
                    if(encounter.getPressure()<80)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>110){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }
                }
                else if(getAge()>3&&getAge()<6){
                    if(encounter.getPressure()<80)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>110){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }
                }
                else if(getAge()>=6&&getAge()<13){
                    if(encounter.getPressure()<80)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>120){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }
                }
                else if(getAge()>=13){
                    if(encounter.getPressure()<110)
                        System.out.println("abnormal systolic blood pressure");           
                    else if(encounter.getPressure()>120){
                        System.out.println("abnormal systolic blood pressure"); 
                        System.out.println("(maybe you have a fever or feel nervous)");  
                    }
                    else{
                        System.out.println("(maybe you are a clinically decompensating child)");
                        return true;
                    }
                }
                else
                    System.out.println("please cheak your input"); 
            }
            else if(s.equals("weight in kilos")){
                System.out.println("please input the weight in kilos:"); 
                encounter.setKilos(input.nextFloat());
                if(getAge()>0&&getAge()<=0.1){
                    if(encounter.getKilos()<2||encounter.getKilos()>3)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true;                                          
                }
                else if(getAge()>0.1&&getAge()<=1){
                    if(encounter.getKilos()<4||encounter.getKilos()>10)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true; 
                }
                else if(getAge()>1&&getAge()<=3){
                    if(encounter.getKilos()<10||encounter.getKilos()>14)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true; 
                }
                else if(getAge()>3&&getAge()<6){
                    if(encounter.getKilos()<14||encounter.getKilos()>18)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true; 
                }
                else if(getAge()>=6&&getAge()<13){
                    if(encounter.getKilos()<20||encounter.getKilos()>42)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true; 
                }
                else if(getAge()>=13){
                    if(encounter.getKilos()<=50)
                        System.out.println("abnormal weight in kilos");           
                    else
                        return true; 
                }
                else
                    System.out.println("please cheak your input"); 
            }
            else if(s.equals("weight in pounds")){
                System.out.println("please input the weight in pounds:"); 
                encounter.setPounds(input.nextFloat());
                if(getAge()>0&&getAge()<=0.1){
                    if(encounter.getPounds()<4.5||encounter.getPounds()>7)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true;                                          
                }
                else if(getAge()>0.1&&getAge()<=1){
                    if(encounter.getPounds()<9||encounter.getPounds()>22)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true; 
                }
                else if(getAge()>1&&getAge()<=3){
                    if(encounter.getPounds()<22||encounter.getPounds()>31)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true; 
                }
                else if(getAge()>3&&getAge()<6){
                    if(encounter.getPounds()<31||encounter.getPounds()>40)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true; 
                }
                else if(getAge()>=6&&getAge()<13){
                    if(encounter.getPounds()<41||encounter.getPounds()>92)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true; 
                }
                else if(getAge()>=13){
                    if(encounter.getPounds()<=110)
                        System.out.println("abnormal weight in pounds");           
                    else
                        return true; 
                }
                else
                    System.out.println("please cheak your input"); 
            }
            else
                System.out.println("please cheak your input");                   
            return false;        
    }
  
    @Override
    public String toString() {
        return "Patient [name:"+getName()+",age:"+getAge()+",year:"+encounter.getYear()+",month:"+encounter.getMonth()+",date:"+encounter.getDate()+",respiratory rate:"+encounter.getRate()+",heart rate:"+encounter.getHeart()+",systolic blood pressure:"+encounter.getPressure()+",weight in kilos:"+encounter.getKilos()+",weight in pounds:"+encounter.getPounds()+" ]";
    }
    
    
}   