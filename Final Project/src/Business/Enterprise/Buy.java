/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.BuyerOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Role.BuyerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class Buy extends Enterprise {
    
    //Zhe Li
    private Organization buyerOrganization;
    
    public Buy(String name){
        super(name,EnterpriseType.Rent);
        //Zhe Li
        buyerOrganization = this.getOrganizationDirectory().createOrganization(Organization.Type.Buyer);
    }
    
    //Zhe Li
    public UserAccount addBuyer(String username, String password) {
        return buyerOrganization.getUserAccountDirectory().createUserAccount(username, password, (Role)new BuyerRole());
    }
    
    //Zhe Li
    public boolean checkBuyerName(String username) {
        return buyerOrganization.getUserAccountDirectory().checkIfUsernameIsUnique(username);
    }

    //Zhe Li
    public Organization getBuyerOrganization() {
        return buyerOrganization;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        ArrayList<Organization> organizations = new ArrayList();
        organizations.add(new BuyerOrganization());
        organizations.add(new CustomerServiceOrganization());
        organizations.add(new ReceptionistOrganization());
        return organizations;
    }
    
}
