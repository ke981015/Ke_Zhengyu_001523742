/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.VehicleConditionInspectorOrganization;
import Business.Organization.WarranterOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class CustomerService extends Enterprise {
    
    public CustomerService(String name){
        super(name,EnterpriseType.CustomerService);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    @Override
    public ArrayList<Organization> getSupportedOrganization() {
        ArrayList<Organization> organizations = new ArrayList();
        organizations.add(new WarranterOrganization());
        return organizations;
    }
    
}
