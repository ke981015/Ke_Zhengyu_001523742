/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seller;

import ui.Buyer.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import javax.swing.JPanel;
/**
 *
 * @author Ke
 */
public class SellerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public SellerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.setSize(1024, 768);       
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        nameLabel.setText(account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        SideBar = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(null);

        SideBar.setBackground(new java.awt.Color(51, 153, 255));
        SideBar.setPreferredSize(new java.awt.Dimension(160, 666));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 153, 255));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        SideBar.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 740, -1, -1));
        SideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 235, 10));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 255));
        jButton5.setText("Q&A");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SideBar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 140, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("New Housing");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SideBar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello,");
        SideBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 32, -1, -1));

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");
        SideBar.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 65, 207, 39));

        jSplitPane1.setLeftComponent(SideBar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 1250, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        HousingInfo listingInfoJPanel = new HousingInfo(userProcessContainer, business,userAccount);
        jSplitPane1.setRightComponent(listingInfoJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        SellerQuestion question = new SellerQuestion(userProcessContainer, userAccount, organization, enterprise, business);
        Router.getInstance(null).go(question);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
