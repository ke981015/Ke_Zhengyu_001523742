/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AirQualityInspectorRole;
import Business.Role.BuyerRole;
import Business.Role.InspectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class InspectorOrganization extends Organization{

    public InspectorOrganization() {
        super(Organization.Type.Inspector.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InspectorRole());
        roles.add(new AirQualityInspectorRole());
        return roles;
    }
     
   
    
    
}
