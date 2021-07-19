/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.AccountantOrganization;
import Business.Organization.BuyerOrganization;
import Business.Organization.Organization;
import Business.Organization.InspectorOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class Account extends Enterprise {
    
    public Account(String name){
        super(name,EnterpriseType.Account);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        ArrayList<Organization> organizations = new ArrayList();
        organizations.add(new AccountantOrganization());
        return organizations;
    }
    
}
