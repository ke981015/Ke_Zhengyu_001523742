/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Ke
 */
public class Seller {
    private String email;
    private String phoneNum;
    public UserAccount userAccount;

    public Seller(String email, String phoneNum, UserAccount userAccount) {
        this.email = email;
        this.phoneNum = phoneNum;
        this.userAccount = userAccount;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    @Override
    public String toString() {
        return userAccount.getUsername();
    }
    
}
