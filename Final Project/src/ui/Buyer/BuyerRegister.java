/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Buyer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Buyer.Buyer;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Purchase;
import Business.Role.BuyerRole;
import Business.Router;

/**
 *
 * @author Ke
 */
public class BuyerRegister extends javax.swing.JPanel {

    /**
     * Creates new form FileJPanel
     */
    JPanel container;
    private EcoSystem system;
    
    public BuyerRegister(JPanel container, EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = container;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRepassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Create a new buyer");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 45, -1, -1));

        jLabel8.setText("—————————————————————————————————————————————————");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 86, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 553, 148, 37));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("RePassword:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        txtPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 153, 255));
        txtPassword.setToolTipText("*");
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 169, -1));

        txtRepassword.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        txtRepassword.setForeground(new java.awt.Color(51, 153, 255));
        txtRepassword.setToolTipText("*");
        add(txtRepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 169, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Phone Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 130, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 50, -1));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 153, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 170, -1));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 153, 255));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Name.");
            return;
        }    
        String userName = jTextField3.getText();
        
        if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Phone.");
            return;
        }
        if(jTextField2.getText().length()!=16){
            JOptionPane.showMessageDialog(this, "Please input the correct type in Phone.");
            return;
        }
        String phone = jTextField2.getText();

        if(txtPassword.getText().equals("") || txtRepassword.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Password.");
            return;
        }    
        String password = txtPassword.getText();
        String repassword = txtRepassword.getText();                
   
        if(!repassword.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Password and Re_Password are not same, Please Check!");
            return;
        }
        
        system.getUserAccountDirectory().createUserAccount(userName, password, phone, new BuyerRole());
        DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Register Buyer Successfully!");
        
        txtPassword.setText("");
        txtRepassword.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(jTextField2.getText().length()==3)
            jTextField2.setText(jTextField2.getText()+" - ");
        if(jTextField2.getText().length()==9)
            jTextField2.setText(jTextField2.getText()+" - ");
    }//GEN-LAST:event_jTextField2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    // End of variables declaration//GEN-END:variables

}
