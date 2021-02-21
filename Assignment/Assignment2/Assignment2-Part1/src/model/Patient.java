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
    
    public static void main(String[] args){
        Patient patient = new Patient();
        staticmethod(patient);
    }
    
    public static void staticmethod(Patient s){
        boolean normal;
        normal = s.isPatientNormal();
        if(normal)
            System.out.println("normal");
    } 
    
    public boolean isPatientNormal(){         
        VitalSigns vitalsigns = new VitalSigns();
        Scanner patient = new Scanner(System.in);
        System.out.println("please input the name and age:");
        vitalsigns.setName(patient.nextLine());
        vitalsigns.setAge(patient.nextFloat());  
        System.out.println("please input the respiratory rate, heart rate, systolic blood pressure, weight in kilos and weight in pounds:");  
        System.out.println("(respiratory on infants should be counted for a full 60 seconds)");
        vitalsigns.setRate(patient.nextInt());
        vitalsigns.setHeart(patient.nextInt());
        vitalsigns.setPressure(patient.nextInt());
        vitalsigns.setKilos(patient.nextFloat());
        vitalsigns.setPounds(patient.nextFloat());
        if(vitalsigns.getAge()>0&&vitalsigns.getAge()<=0.1){
            if(vitalsigns.getRate()<30||vitalsigns.getRate()>50)              
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<120||vitalsigns.getHeart()>160)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<50||vitalsigns.getPressure()>70)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<2||vitalsigns.getKilos()>3)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<4.5||vitalsigns.getPounds()>7)
                System.out.println("abnormal weight in pounds");   
            if(vitalsigns.getRate()>50||vitalsigns.getHeart()>160||vitalsigns.getPressure()>70)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=50||vitalsigns.getPressure()<=70)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<120)
                System.out.println("!!!bradycardia!!!");           
            if(vitalsigns.getRate()>=30&&vitalsigns.getRate()<=50&&vitalsigns.getHeart()>=120&vitalsigns.getHeart()<=160&&vitalsigns.getPressure()>=50&&vitalsigns.getPressure()<=70&&vitalsigns.getKilos()>=2&&vitalsigns.getKilos()<=3&&vitalsigns.getPounds()>=4.5&&vitalsigns.getPounds()<=7)
                return true;
        }
        else if(vitalsigns.getAge()>0.1&&vitalsigns.getAge()<=1){
            float infantrate = vitalsigns.getRate()/60;
            if(infantrate<(1/3)||infantrate>0.5)                  
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<80||vitalsigns.getHeart()>140)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<70||vitalsigns.getPressure()>100)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<4||vitalsigns.getKilos()>10)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<9||vitalsigns.getPounds()>22)
                System.out.println("abnormal weight in pounds");   
            if(infantrate>0.5||vitalsigns.getHeart()>140||vitalsigns.getPressure()>100)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=70||vitalsigns.getPressure()<=100)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<80)
                System.out.println("!!!bradycardia!!!");            
            if(infantrate>=(1/3)&&infantrate<=0.5&&vitalsigns.getHeart()>=80&vitalsigns.getHeart()<=140&&vitalsigns.getPressure()>=70&&vitalsigns.getPressure()<=100&&vitalsigns.getKilos()>=4&&vitalsigns.getKilos()<=10&&vitalsigns.getPounds()>=9&&vitalsigns.getPounds()<=22)
                return true;
        }
        else if(vitalsigns.getAge()>1&&vitalsigns.getAge()<=3){
            if(vitalsigns.getRate()<20||vitalsigns.getRate()>30)                  
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<80||vitalsigns.getHeart()>130)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<80||vitalsigns.getPressure()>110)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<10||vitalsigns.getKilos()>14)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<22||vitalsigns.getPounds()>31)
                System.out.println("abnormal weight in pounds");   
            if(vitalsigns.getRate()>30||vitalsigns.getHeart()>130||vitalsigns.getPressure()>110)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=80||vitalsigns.getPressure()<=110)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<80)
                System.out.println("!!!bradycardia!!!");          
            if(vitalsigns.getRate()>=20&&vitalsigns.getRate()<=30&&vitalsigns.getHeart()>80&vitalsigns.getHeart()<=130&&vitalsigns.getPressure()>=80&&vitalsigns.getPressure()<=110&&vitalsigns.getKilos()>=10&&vitalsigns.getKilos()<=14&&vitalsigns.getPounds()>=22&&vitalsigns.getPounds()<=31)
                return true;
        }
        else if(vitalsigns.getAge()>3&&vitalsigns.getAge()<6){
            if(vitalsigns.getRate()<20||vitalsigns.getRate()>30)                 
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<80||vitalsigns.getHeart()>120)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<80||vitalsigns.getPressure()>110)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<14||vitalsigns.getKilos()>18)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<31||vitalsigns.getPounds()>40)
                System.out.println("abnormal weight in pounds");   
            if(vitalsigns.getRate()>30||vitalsigns.getHeart()>120||vitalsigns.getPressure()>110)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=80||vitalsigns.getPressure()<=110)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<80)
                System.out.println("!!!bradycardia!!!");           
            if(vitalsigns.getRate()>=20&&vitalsigns.getRate()<=30&&vitalsigns.getHeart()>=80&vitalsigns.getHeart()<=120&&vitalsigns.getPressure()>=80&&vitalsigns.getPressure()<=110&&vitalsigns.getKilos()>=14&&vitalsigns.getKilos()<=18&&vitalsigns.getPounds()>=31&&vitalsigns.getPounds()<=40)
                return true;
        }
        else if(vitalsigns.getAge()>=6&&vitalsigns.getAge()<13){
            if(vitalsigns.getRate()<20||vitalsigns.getRate()>30)                 
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<70||vitalsigns.getHeart()>110)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<80||vitalsigns.getPressure()>120)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<20||vitalsigns.getKilos()>42)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<41||vitalsigns.getPounds()>92)
                System.out.println("abnormal weight in pounds");   
            if(vitalsigns.getRate()>30||vitalsigns.getHeart()>110||vitalsigns.getPressure()>120)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=80||vitalsigns.getPressure()<=120)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<70)
                System.out.println("!!!bradycardia!!!");
            if(vitalsigns.getRate()>=20&&vitalsigns.getRate()<=30&&vitalsigns.getHeart()>=70&vitalsigns.getHeart()<=110&&vitalsigns.getPressure()>=80&&vitalsigns.getPressure()<=120&&vitalsigns.getKilos()>=20&&vitalsigns.getKilos()<=42&&vitalsigns.getPounds()>=41&&vitalsigns.getPounds()<=92)
                return true;
        }
        else if(vitalsigns.getAge()>=13){
            if(vitalsigns.getRate()<12||vitalsigns.getRate()>20)                  
                System.out.println("abnormal respiratory rate"); 
            if(vitalsigns.getHeart()<55||vitalsigns.getHeart()>105)
                System.out.println("abnormal heart rate");
            if(vitalsigns.getPressure()<110||vitalsigns.getPressure()>120)
                System.out.println("abnormal systolic blood pressure");
            if(vitalsigns.getKilos()<=50)
                System.out.println("abnormal weight in kilos");
            if(vitalsigns.getPounds()<=110)
                System.out.println("abnormal weight in pounds");   
            if(vitalsigns.getRate()>20||vitalsigns.getHeart()>105||vitalsigns.getPressure()>120)
                System.out.println("(maybe you have a fever or feel nervous)");
            if(vitalsigns.getPressure()>=110||vitalsigns.getPressure()<=120)
                System.out.println("(maybe you are a clinically decompensating child)");
            if(vitalsigns.getHeart()<55)
                System.out.println("!!!bradycardia!!!");
            if(vitalsigns.getRate()>=12&&vitalsigns.getRate()<=20&&vitalsigns.getHeart()>=55&vitalsigns.getHeart()<=105&&vitalsigns.getPressure()>=110&&vitalsigns.getPressure()<=120&&vitalsigns.getKilos()>50&&vitalsigns.getPounds()>110)
                return true;
        }
        else
            System.out.println("please cheak your input");
        return false;
    }
}   
