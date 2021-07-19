/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.BuyerOrganization;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.Organization.InspectorOrganization;
import Business.Organization.SellerOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class UploadHousingInfo extends Enterprise {
    
    public UploadHousingInfo(String name){
        super(name,EnterpriseType.UploadHousingInfo);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        ArrayList<Organization> organizations = new ArrayList();
        organizations.add(new SellerOrganization());
        organizations.add(new InspectorOrganization());
        return organizations;
    }
    
}
