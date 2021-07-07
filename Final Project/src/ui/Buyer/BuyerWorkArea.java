/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Buyer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Global;
import Business.Listings;
import Business.ListingsDirectory;
import Business.Organization.Organization;
import Business.Organization.SellerOrganization;
import Business.Role.BuyerRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.AbstractQuestion;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.WarranterRole.WarranterWorkAreaJPanel;

/**
 *
 * @author Ke
 */
public class BuyerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private AbstractQuestion course;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public BuyerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AbstractQuestion course) {
        initComponents();
        this.setSize(1024, 768);
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.course = course;
        initCourses(/*business.getListingsDirectory()*/);
    }
    
    private void initCourses(/*ListingsDirectory courseDir*/){

        /*for (Listings course : courseDir){
            ListingsCell cell = new ListingsCell(course);
            jPanel1.add(cell);
            cell.setPreferredSize(new Dimension(jPanel1.getWidth(), cell_H));
        }*/

        //scrollPanel.setSize(contentPanel.getWidth(), cell_H * courseDir.getList().size() / 2 + 1);

        /*jPanel1.setSize(jPanel1.getWidth(), cell_H * courseDir.getList().size() / 2 + 1);

        jPanel1.setPreferredSize(new Dimension(jPanel1.getWidth(), cell_H * courseDir.getList().size() / 2 + 1));
        updateUI();*/
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
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setLayout(null);

        SideBar.setBackground(new java.awt.Color(33, 135, 251));
        SideBar.setPreferredSize(new java.awt.Dimension(160, 666));

        nameLabel.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 153, 255));
        jButton6.setText("Book an on-site view");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 153, 255));
        jButton5.setText("View the vehicle condition report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("after-sale warranty");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("View vehicle information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SideBarLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SideBarLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(backButton))
                                .addGroup(SideBarLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(jButton6))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButton6)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(49, 49, 49)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(47, 47, 47))
        );

        jSplitPane1.setLeftComponent(SideBar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 1150, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File file = new File("src\\resource\\after-sale warranty.docx");
        try {
            java.awt.Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(WarranterWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please choose a car!");
            return;
        }
        
        WorkRequest car =  (WorkRequest)workRequestJTable.getValueAt(selectedRow, 3);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new ViewVehicleInfoJPanel(userProcessContainer,business,car));
        layout.next(userProcessContainer);*/
        ViewListingInfo report = new ViewListingInfo(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ViewReport report = new ViewReport(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please choose a car!");
            return;
        }
        
        WorkRequest car =  (WorkRequest)workRequestJTable.getValueAt(selectedRow, 3);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new BookAppointmentJPanel(userProcessContainer,business,car));
        layout.next(userProcessContainer);*/
        BookAppointmentJPanel report = new BookAppointmentJPanel(userProcessContainer,business,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
