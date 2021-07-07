/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author raunak
 */
public abstract class AbstractQuestion {

    String[] path = new String[10];
    private boolean done;
    private String tag1;
    private String tag2;
    private String tag3;
    private String tag4;
    private String livingroom1;
    private String livingroom2;
    private String livingroom3;
    private String livingroom4;
    private String livingroom5;
    private String livingroom6;
    private String livingroom7;
    private String livingroom8;
    private String bedroom1;
    private String bedroom2;
    private String bedroom3;
    private String bedroom4;
    private String bedroom5;
    private String bedroom6;
    private String toilet1;
    private String toilet2;
    private String kitchen1;
    private String kitchen2;
    private String kitchen3;
    private String kitchen4;
    private String kitchen5;
    private String question;
    private String dealdate;
    private String dealprice;
    private UserAccount sender;
    private UserAccount solver;
    private UserAccount publisher;
    private String answer;
    private String make;
    private String model;
    private String year;
    private String category;
    private String state;
    private String city;
    private String vin;
    private String mileage;
    private String horsepower;
    private String inColor;
    private String fuelType;
    private String transmission;
    private String mpgCity;
    private String mpgHwy;
    private String drivetrain;
    private String frontPicture;
    private String backPicture;
    private String dashBoardPicture;
    private String valuation;
    private String date;
    private String phone;
    private String name;
    private String contact;
    
    
    public AbstractQuestion(){
        
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getSolver() {
        return solver;
    }

    public void setSolver(UserAccount solver) {
        this.solver = solver;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getInColor() {
        return inColor;
    }

    public void setInColor(String inColor) {
        this.inColor = inColor;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(String mpgCity) {
        this.mpgCity = mpgCity;
    }

    public String getMpgHwy() {
        return mpgHwy;
    }

    public void setMpgHwy(String mpgHwy) {
        this.mpgHwy = mpgHwy;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public String getFrontPicture() {
        return frontPicture;
    }

    public void setFrontPicture(String frontPicture) {
        this.frontPicture = frontPicture;
    }

    public String getBackPicture() {
        return backPicture;
    }

    public void setBackPicture(String backPicture) {
        this.backPicture = backPicture;
    }

    public String getDashBoardPicture() {
        return dashBoardPicture;
    }

    public void setDashBoardPicture(String dashBoardPicture) {
        this.dashBoardPicture = dashBoardPicture;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public UserAccount getPublisher() {
        return publisher;
    }

    public void setPublisher(UserAccount publisher) {
        this.publisher = publisher;
    }

    public String getDealdate() {
        return dealdate;
    }

    public void setDealdate(String dealdate) {
        this.dealdate = dealdate;
    }

    public String getDealprice() {
        return dealprice;
    }

    public void setDealprice(String dealprice) {
        this.dealprice = dealprice;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String[] getPath() {
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getTag4() {
        return tag4;
    }

    public void setTag4(String tag4) {
        this.tag4 = tag4;
    }

    public String getLivingroom1() {
        return livingroom1;
    }

    public void setLivingroom1(String livingroom1) {
        this.livingroom1 = livingroom1;
    }

    public String getLivingroom2() {
        return livingroom2;
    }

    public void setLivingroom2(String livingroom2) {
        this.livingroom2 = livingroom2;
    }

    public String getLivingroom3() {
        return livingroom3;
    }

    public void setLivingroom3(String livingroom3) {
        this.livingroom3 = livingroom3;
    }

    public String getLivingroom4() {
        return livingroom4;
    }

    public void setLivingroom4(String livingroom4) {
        this.livingroom4 = livingroom4;
    }

    public String getLivingroom5() {
        return livingroom5;
    }

    public void setLivingroom5(String livingroom5) {
        this.livingroom5 = livingroom5;
    }

    public String getLivingroom6() {
        return livingroom6;
    }

    public void setLivingroom6(String livingroom6) {
        this.livingroom6 = livingroom6;
    }

    public String getLivingroom7() {
        return livingroom7;
    }

    public void setLivingroom7(String livingroom7) {
        this.livingroom7 = livingroom7;
    }

    public String getLivingroom8() {
        return livingroom8;
    }

    public void setLivingroom8(String livingroom8) {
        this.livingroom8 = livingroom8;
    }

    public String getBedroom1() {
        return bedroom1;
    }

    public void setBedroom1(String bedroom1) {
        this.bedroom1 = bedroom1;
    }

    public String getBedroom2() {
        return bedroom2;
    }

    public void setBedroom2(String bedroom2) {
        this.bedroom2 = bedroom2;
    }

    public String getBedroom3() {
        return bedroom3;
    }

    public void setBedroom3(String bedroom3) {
        this.bedroom3 = bedroom3;
    }

    public String getBedroom4() {
        return bedroom4;
    }

    public void setBedroom4(String bedroom4) {
        this.bedroom4 = bedroom4;
    }

    public String getBedroom5() {
        return bedroom5;
    }

    public void setBedroom5(String bedroom5) {
        this.bedroom5 = bedroom5;
    }

    public String getBedroom6() {
        return bedroom6;
    }

    public void setBedroom6(String bedroom6) {
        this.bedroom6 = bedroom6;
    }

    public String getToilet1() {
        return toilet1;
    }

    public void setToilet1(String toilet1) {
        this.toilet1 = toilet1;
    }

    public String getToilet2() {
        return toilet2;
    }

    public void setToilet2(String toilet2) {
        this.toilet2 = toilet2;
    }

    public String getKitchen1() {
        return kitchen1;
    }

    public void setKitchen1(String kitchen1) {
        this.kitchen1 = kitchen1;
    }

    public String getKitchen2() {
        return kitchen2;
    }

    public void setKitchen2(String kitchen2) {
        this.kitchen2 = kitchen2;
    }

    public String getKitchen3() {
        return kitchen3;
    }

    public void setKitchen3(String kitchen3) {
        this.kitchen3 = kitchen3;
    }

    public String getKitchen4() {
        return kitchen4;
    }

    public void setKitchen4(String kitchen4) {
        this.kitchen4 = kitchen4;
    }

    public String getKitchen5() {
        return kitchen5;
    }

    public void setKitchen5(String kitchen5) {
        this.kitchen5 = kitchen5;
    }

    

}
