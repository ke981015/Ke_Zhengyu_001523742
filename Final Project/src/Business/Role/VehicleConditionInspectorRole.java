/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SellerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BuyerRole.BuyerWorkAreaJPanel2;
import ui.VehicleConditionInspectorRole.InspectorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class VehicleConditionInspectorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InspectorWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
