/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BuyerRole;
import Business.Role.Role;
import Business.Role.BuyerServiceRole;
import Business.Role.ReceptionistRole;
import Business.Role.SellerServiceRole;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class ReceptionistOrganization extends Organization{

    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }
     
   
    
    
}
