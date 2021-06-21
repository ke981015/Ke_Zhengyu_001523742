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
import ui.CustomerServiceRole.BuyerServiceWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class BuyerServiceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BuyerServiceWorkAreaJPanel(userProcessContainer, account, enterprise, business);
    }
    
}
