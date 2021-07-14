/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Buyer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.BuyerRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import Business.WorkQueue.WorkRequest;
import java.awt.GridLayout;
import javax.swing.JPanel;
import ui.components.QuestionCell;


/**
 *
 * @author Ke
 */
public class BuyerQuestion extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public BuyerQuestion(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        initFiles();
    }

    private void initFiles(){

        contentPanel.setLayout(new GridLayout(0,1));

        for (AbstractQuestion request : business.getWorkQueue().getWorkRequestList()){
            if(request.getSender() != null){
                if(request.getSender().getRole() instanceof BuyerRole){
                    QuestionCell cell = new QuestionCell(userProcessContainer,userAccount,organization,enterprise,business,request);
                    contentPanel.add(cell);                
                }
            }
        }
        
        updateUI();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        requestTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollPanel = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        sidePanel.setBackground(new java.awt.Color(51, 153, 255));
        sidePanel.setPreferredSize(new java.awt.Dimension(160, 768));

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 153, 255));
        logoutButton.setText("<< Back");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question:");

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(51, 153, 255));
        requestTestJButton.setText("Ask");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 153, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 933, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2008, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(contentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String q = jTextArea1.getText();

        WorkRequest question = new WorkRequest();
        question.setQuestion(q);
        question.setSender(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(question);
        business.getWorkQueue().getWorkRequestList().add(question);
        QuestionCell cell = new QuestionCell(userProcessContainer,userAccount,organization,enterprise,business,question);
        contentPanel.add(cell);  
        DB4OUtil.getInstance().storeSystem(business);
        updateUI();
        //enterprise.getWorkQueue().getWorkRequestList().add(question);

        /*Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof BuyerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getQuestionDirectory().getQuestionList().add(question);
            userAccount.getQuestionDirectory().getQuestionList().add(question);
        }
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CustomerServiceOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(question);
            JOptionPane.showMessageDialog(null, "Please input username or password!");
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }*/

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
