/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryManOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.ManagerRole.ManagerWorkAreaJPanel;
import javax.swing.JPanel;
import ui.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DeliveryManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account, (DeliveryManOrganization)organization, enterprise);
    }
    
}
