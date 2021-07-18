/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AirQualityInspector;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ke
 */
public class AirQualityInspectorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FileJPanel
     */
    public JPanel container;
    public EcoSystem system;
    private UserAccount userAccount;
    AbstractQuestion course;
    
    public AirQualityInspectorWorkArea(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, AbstractQuestion course) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.course = course;
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
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Create a air quality report");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 49, -1, -1));

        jLabel8.setText("—————————————————————————————————————————————————");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 90, -1, -1));

        backJButton.setBackground(new java.awt.Color(51, 153, 255));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 548, 160, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Site temperature:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Site humidity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 289, -1, -1));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 153, 255));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 216, 99, -1));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 153, 255));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 286, 99, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("°C");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 222, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("%RH");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 289, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Formaldehyde:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 365, -1, -1));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 153, 255));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 362, 99, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("mg/m³");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 365, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if(Double.parseDouble(jTextField1.getText())> -50 && Double.parseDouble(jTextField1.getText())< 50)
                course.setTemperature(Double.parseDouble(jTextField1.getText()));
            else{
                JOptionPane.showMessageDialog(this, "Please input the correct value in Temperature.");
                return;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please input the correct type in Temperature.");
            return;
        }
        
        try{
            if(Double.parseDouble(jTextField2.getText())>0 && Double.parseDouble(jTextField2.getText())< 100)
                course.setHumidity(Double.parseDouble(jTextField2.getText()));
            else{
                JOptionPane.showMessageDialog(this, "Please input the correct value in Humidity.");
                return;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please input the correct type in Humidity.");
            return;
        }
        
        try{
            if(Double.parseDouble(jTextField3.getText())>=0 && Double.parseDouble(jTextField3.getText())< 1)
                course.setFormaldehyde(Double.parseDouble(jTextField3.getText()));
            else{
                JOptionPane.showMessageDialog(this, "Please input the correct value in Formaldehyde.");
                return;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please input the correct type in Formaldehyde.");
            return;
        }
        
        DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(this, "Saved.");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void copyFile(File f1, File f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
