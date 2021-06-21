/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BuyerRole;
import Business.Role.Role;
import Business.Role.BuyerServiceRole;
import Business.Role.SellerServiceRole;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class CustomerServiceOrganization extends Organization{

    public CustomerServiceOrganization() {
        super(Organization.Type.CustomerService.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BuyerServiceRole());
        roles.add(new SellerServiceRole());
        return roles;
    }
     
   
    
    
}
