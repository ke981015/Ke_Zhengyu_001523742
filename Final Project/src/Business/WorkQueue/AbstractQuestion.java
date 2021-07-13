/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

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
    private String dealyear;
    private String dealmonth;
    private String dealdate;
    private Double dealprice;
    private Double temperature;
    private Double humidity;
    private Double Formaldehyde;
    private Double area;
    private String address1;
    private String address2;
    private String Orientation;
    private int bedroom;
    private int bathroom;
    private int livingroom;
    private int floor;
    private double rent;
    private String state;
    private String city;
    private String date;
    
    private UserAccount sender;
    private UserAccount solver;
    private UserAccount publisher;
    private String answer;
    private String phone;
    private String name;
    private String contact;
    private boolean elevator;
    
    
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDealyear() {
        return dealyear;
    }

    public void setDealyear(String dealyear) {
        this.dealyear = dealyear;
    }

    public String getDealmonth() {
        return dealmonth;
    }

    public void setDealmonth(String dealmonth) {
        this.dealmonth = dealmonth;
    }

    public String getDealdate() {
        return dealdate;
    }

    public void setDealdate(String dealdate) {
        this.dealdate = dealdate;
    }

    public Double getDealprice() {
        return dealprice;
    }

    public void setDealprice(Double dealprice) {
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

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getFormaldehyde() {
        return Formaldehyde;
    }

    public void setFormaldehyde(Double Formaldehyde) {
        this.Formaldehyde = Formaldehyde;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getOrientation() {
        return Orientation;
    }

    public void setOrientation(String Orientation) {
        this.Orientation = Orientation;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getLivingroom() {
        return livingroom;
    }

    public void setLivingroom(int livingroom) {
        this.livingroom = livingroom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isElevator() {
        return elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
 

}
