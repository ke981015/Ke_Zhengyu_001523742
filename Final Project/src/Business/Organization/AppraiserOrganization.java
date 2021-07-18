/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AccountantRole;
import Business.Role.AirQualityInspectorRole;
import Business.Role.BuyerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class AppraiserOrganization extends Organization{

    public AppraiserOrganization() {
        super(Organization.Type.Accounter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AirQualityInspectorRole());
        roles.add(new AccountantRole());
        return roles;
    }
     
   
    
    
}
