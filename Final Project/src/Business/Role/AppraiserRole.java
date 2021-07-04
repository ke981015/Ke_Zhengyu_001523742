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
import ui.AppraiserRole.AppraiserWorkAreaJPanel;
import ui.BuyerRole.BuyerWorkArea;

/**
 *
 * @author raunak
 */
public class AppraiserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AppraiserWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
}
