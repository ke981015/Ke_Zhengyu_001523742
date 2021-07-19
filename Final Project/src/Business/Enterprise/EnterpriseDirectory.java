/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ke
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Purchase){
            enterprise=new Purchase(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.UploadHousingInfo){
            enterprise=new UploadHousingInfo(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Account){
            enterprise=new Account(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.CustomerService){
            enterprise=new CustomerService(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
