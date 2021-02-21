/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Patient {
    
    VitalSignHistory history = new VitalSignHistory();;
    
    VitalSigns vitalsigns = history.addNewVitals();
    
    /*public Patient(){
        history = new VitalSignHistory();
    }*/
    public static void main(String[] args){
        Patient patient = new Patient();
        staticmethod(patient);
    }
    
    public static void staticmethod(Patient s){
        s.SavePatient();
        boolean normal;
        String vs;
        Scanner patient = new Scanner(System.in);
        System.out.println("please input the vital sign:(input down to end)");
        vs = patient.nextLine();
        if(vs.equals("down")){
            s.output();
        }
        else{
            for(;;){
            normal = s.isThisVitalSignNormal(vs);       
            if(normal)
                System.out.println("normal");
            System.out.println("please input the vital sign:(input down to end)");
            vs = patient.nextLine();
            if(vs.equals("down")){
                s.output();
                break;
            }
            }
        }
    }
    
    public void SavePatient(){
        Scanner patient = new Scanner(System.in);
        System.out.println("please input the name and age:");
        vitalsigns.setName(patient.nextLine());
        vitalsigns.setAge(patient.nextFloat());
    }

    
    public boolean isThisVitalSignNormal(String s){   
        Scanner patient = new Scanner(System.in);
        if(s.equals("respiratory rate")){
            System.out.println("please input the respiratory rate:"); 
            System.out.println("(respiratory on infants should be counted for a full 60 seconds)");
            vitalsigns.setRate(patient.nextInt());
            if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
                if(vitalsigns.getRate()<30)              
                    System.out.println("abnormal respiratory rate"); 
                else if(vitalsigns.getRate()>50){
                    System.out.println("abnormal respiratory rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
                float infantrate = vitalsigns.getRate()/60;
                if(infantrate<(1/3))                  
                    System.out.println("abnormal respiratory rate"); 
                else if(infantrate>0.5){
                    System.out.println("abnormal respiratory rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
                if(vitalsigns.getRate()<20)                  
                    System.out.println("abnormal respiratory rate"); 
                else if(vitalsigns.getRate()>30){
                    System.out.println("abnormal respiratory rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
                if(vitalsigns.getRate()<20)                 
                    System.out.println("abnormal respiratory rate");  
                else if(vitalsigns.getRate()>30){
                    System.out.println("abnormal respiratory rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
                if(vitalsigns.getRate()<20)                 
                    System.out.println("abnormal respiratory rate"); 
                else if(vitalsigns.getRate()>30){
                    System.out.println("abnormal respiratory rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>=13){
                if(vitalsigns.getRate()<12)                  
                    System.out.println("abnormal respiratory rate"); 
                else if(vitalsigns.getRate()>20){
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
            vitalsigns.setHeart(patient.nextInt());
            if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
                if(vitalsigns.getHeart()<120){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>160){
                    System.out.println("abnormal heart rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
                if(vitalsigns.getHeart()<80){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>140){
                    System.out.println("abnormal heart rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
                if(vitalsigns.getHeart()<80){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>130){
                    System.out.println("abnormal heart rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
                if(vitalsigns.getHeart()<80){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>120){
                    System.out.println("abnormal heart rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
                if(vitalsigns.getHeart()<70){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>110){
                    System.out.println("abnormal heart rate"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else
                    return true;
            }
            else if(vitalsigns.getAge()>=13){
                if(vitalsigns.getHeart()<55){
                    System.out.println("abnormal heart rate");
                    System.out.println("!!!bradycardia!!!"); 
                }
                else if(vitalsigns.getHeart()>105){
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
            vitalsigns.setPressure(patient.nextInt());
            if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
                if(vitalsigns.getPressure()<50)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>70){
                    System.out.println("abnormal systolic blood pressure"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else{
                    System.out.println("(maybe you are a clinically decompensating child)");
                    return true;
                }                              
            }
            else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
                if(vitalsigns.getPressure()<70)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>100){
                    System.out.println("abnormal systolic blood pressure"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else{
                    System.out.println("(maybe you are a clinically decompensating child)");
                    return true;
                }
            }
            else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
                if(vitalsigns.getPressure()<80)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>110){
                    System.out.println("abnormal systolic blood pressure"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else{
                    System.out.println("(maybe you are a clinically decompensating child)");
                    return true;
                }
            }
            else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
                if(vitalsigns.getPressure()<80)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>110){
                    System.out.println("abnormal systolic blood pressure"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else{
                    System.out.println("(maybe you are a clinically decompensating child)");
                    return true;
                }
            }
            else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
                if(vitalsigns.getPressure()<80)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>120){
                    System.out.println("abnormal systolic blood pressure"); 
                    System.out.println("(maybe you have a fever or feel nervous)");  
                }
                else{
                    System.out.println("(maybe you are a clinically decompensating child)");
                    return true;
                }
            }
            else if(vitalsigns.getAge()>=13){
                if(vitalsigns.getPressure()<110)
                    System.out.println("abnormal systolic blood pressure");           
                else if(vitalsigns.getPressure()>120){
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
            vitalsigns.setKilos(patient.nextFloat());
            if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
                if(vitalsigns.getKilos()<2||vitalsigns.getKilos()>3)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true;                                          
            }
            else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
                if(vitalsigns.getKilos()<4||vitalsigns.getKilos()>10)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
                if(vitalsigns.getKilos()<10||vitalsigns.getKilos()>14)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
                if(vitalsigns.getKilos()<14||vitalsigns.getKilos()>18)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
                if(vitalsigns.getKilos()<20||vitalsigns.getKilos()>42)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>=13){
                if(vitalsigns.getKilos()<=50)
                    System.out.println("abnormal weight in kilos");           
                else
                    return true; 
            }
            else
                System.out.println("please cheak your input"); 
        }
        else if(s.equals("weight in pounds")){
            System.out.println("please input the weight in pounds:"); 
            vitalsigns.setPounds(patient.nextFloat());
            if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
                if(vitalsigns.getPounds()<4.5||vitalsigns.getPounds()>7)
                    System.out.println("abnormal weight in pounds");           
                else
                    return true;                                          
            }
            else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
                if(vitalsigns.getPounds()<9||vitalsigns.getPounds()>22)
                    System.out.println("abnormal weight in pounds");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
                if(vitalsigns.getPounds()<22||vitalsigns.getPounds()>31)
                    System.out.println("abnormal weight in pounds");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
                if(vitalsigns.getPounds()<31||vitalsigns.getPounds()>40)
                    System.out.println("abnormal weight in pounds");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
                if(vitalsigns.getPounds()<41||vitalsigns.getPounds()>92)
                    System.out.println("abnormal weight in pounds");           
                else
                    return true; 
            }
            else if(vitalsigns.getAge()>=13){
                if(vitalsigns.getPounds()<=110)
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
    
    public void output(){
        for(VitalSigns vitalsigns : history.getHistory()){
            System.out.println("name:"+vitalsigns.getName());
            System.out.println("age:"+vitalsigns.getAge());
            System.out.println("respiratory rate:"+vitalsigns.getRate());
            System.out.println("heart rate:"+vitalsigns.getHeart());
            System.out.println("systolic blood pressure:"+vitalsigns.getPressure());
            System.out.println("weight in kilos:"+vitalsigns.getKilos());
            System.out.println("weight in pounds:"+vitalsigns.getPounds());
        }       
    }
}   
