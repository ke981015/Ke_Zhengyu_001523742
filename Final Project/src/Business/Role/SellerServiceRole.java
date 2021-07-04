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
import ui.BuyerRole.BuyerWorkArea;
import ui.CustomerServiceRole.BuyerServiceWorkAreaJPanel;
import ui.CustomerServiceRole.SellerServiceWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SellerServiceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SellerServiceWorkAreaJPanel(userProcessContainer, account, enterprise, business);
    }
    
}
