/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BuyerRole;
import Business.Role.InspectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class VehicleConditionInspectorOrganization extends Organization{

    public VehicleConditionInspectorOrganization() {
        super(Organization.Type.VehicleConditionInspector.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InspectorRole());
        return roles;
    }
     
   
    
    
}
