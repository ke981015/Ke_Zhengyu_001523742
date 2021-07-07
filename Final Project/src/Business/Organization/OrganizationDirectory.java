/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Seller.getValue())){
            organization = new SellerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Buyer.getValue())){
            organization = new BuyerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Appraiser.getValue())){
            organization = new AppraiserOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.VehicleConditionInspector.getValue())){
            organization = new VehicleConditionInspectorOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization();
            organizationList.add(organization);
        }
        /*if (type.getValue().equals(Type.Warranter.getValue())){
            organization = new WarranterOrganization();
            organizationList.add(organization);
        }*/
        return organization;
    }
}