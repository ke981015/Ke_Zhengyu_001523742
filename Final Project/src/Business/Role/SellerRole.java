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
import ui.Buyer.BuyerWorkArea;
import ui.Seller.SellerWorkArea;

/**
 *
 * @author raunak
 */
public class SellerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SellerWorkArea(userProcessContainer, account, (SellerOrganization)organization, enterprise, business);
    }
    
    
}
