/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BuyerRole;
import Business.Role.Role;
import Business.Role.WarranterRole;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class WarranterOrganization extends Organization{

    public WarranterOrganization() {
        super(Organization.Type.Warranter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarranterRole());
        return roles;
    }
     
   
    
    
}
