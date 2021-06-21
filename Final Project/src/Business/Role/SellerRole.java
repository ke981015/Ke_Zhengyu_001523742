/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SellerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BuyerRole.BuyerWorkAreaJPanel2;
import ui.SellerRole.SellerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SellerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SellerWorkAreaJPanel(userProcessContainer, account, (SellerOrganization)organization, enterprise, business);
    }
    
    
}
