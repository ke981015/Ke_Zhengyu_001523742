/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AirQualityInspector;

import ui.VehicleConditionInspectorRole.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Router;
import Business.WorkQueue.AbstractQuestion;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.SystemAdminRole.SystemAdminWorkAreaJPanel;


public class AirQualityInspectorWorkArea extends javax.swing.JPanel {
    public JPanel container;
    public EcoSystem business;
    //WorkRequest car;
    private AbstractQuestion course;

    /**
     * Creates new form VehicleConditionReportJPanel
     */
    public AirQualityInspectorWorkArea(JPanel userProcessContainer, EcoSystem business, /*WorkRequest car*/AbstractQuestion course) {
        initComponents();
        this.container = userProcessContainer;
        this.business = business;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("1.Has the vehicle ever been in an accident?");
        add(jLabel1);
        jLabel1.setBounds(190, 140, 552, 19);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("2.Does the vehicle have any flood damage?");
        add(jLabel2);
        jLabel2.setBounds(190, 170, 552, 19);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("3.Does the vehicle have any frame damage?");
        add(jLabel3);
        jLabel3.setBounds(190, 210, 552, 19);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("4.Are there any mechanical issues or warning lights displayed on the dashboard?");
        add(jLabel4);
        jLabel4.setBounds(190, 250, 516, 19);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("5.Has this odometer ever been broken or replaced?");
        add(jLabel5);
        jLabel5.setBounds(190, 280, 552, 19);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("6.Are there any panels in need of paint or body work?");
        add(jLabel6);
        jLabel6.setBounds(190, 310, 552, 19);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("7.Are any interior parts broken or inoperable?");
        add(jLabel7);
        jLabel7.setBounds(190, 340, 552, 19);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("8.Are there any rips, tears, or stains in the interior?");
        add(jLabel8);
        jLabel8.setBounds(190, 370, 552, 19);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("9.Do any tires need to be replaced?");
        add(jLabel9);
        jLabel9.setBounds(190, 410, 552, 19);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("10.How many keys does the car have?");
        add(jLabel10);
        jLabel10.setBounds(190, 440, 552, 19);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("11.Does the vehicle have any aftermarket modifications?");
        add(jLabel11);
        jLabel11.setBounds(190, 470, 552, 19);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("12.Are there any other issues with the vehicle?");
        add(jLabel12);
        jLabel12.setBounds(190, 500, 552, 19);

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField1);
        jTextField1.setBounds(750, 140, 75, 24);

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField2);
        jTextField2.setBounds(750, 170, 75, 24);

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField3);
        jTextField3.setBounds(750, 200, 75, 24);

        jTextField4.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField4);
        jTextField4.setBounds(750, 240, 75, 24);

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField5);
        jTextField5.setBounds(750, 270, 75, 24);

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField6);
        jTextField6.setBounds(750, 300, 75, 24);

        jTextField7.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField7);
        jTextField7.setBounds(750, 340, 75, 24);

        jTextField8.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField8);
        jTextField8.setBounds(750, 370, 75, 24);

        jTextField9.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField9);
        jTextField9.setBounds(750, 400, 75, 24);

        jTextField10.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField10);
        jTextField10.setBounds(750, 430, 75, 24);

        jTextField11.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField11);
        jTextField11.setBounds(750, 460, 75, 24);

        jTextField12.setBackground(new java.awt.Color(255, 204, 204));
        add(jTextField12);
        jTextField12.setBounds(750, 500, 75, 24);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(510, 550, 65, 27);

        backJButton.setBackground(new java.awt.Color(255, 204, 204));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 153, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(20, 30, 83, 27);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/6905b594d7eab2eafa12cd1d1022f3cd.jpeg"))); // NOI18N
        jLabel13.setText("jLabel13");
        add(jLabel13);
        jLabel13.setBounds(0, 0, 1170, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        course.setQ1(jTextField1.getText());
        course.setQ2(jTextField2.getText());
        course.setQ3(jTextField3.getText());
        course.setQ4(jTextField4.getText());
        course.setQ5(jTextField5.getText());
        course.setQ6(jTextField6.getText());
        course.setQ7(jTextField7.getText());
        course.setQ8(jTextField8.getText());
        course.setQ9(jTextField9.getText());
        course.setQ10(jTextField10.getText());
        course.setQ11(jTextField11.getText());
        course.setQ12(jTextField12.getText());
        DB4OUtil.getInstance().storeSystem(business);
        JOptionPane.showMessageDialog(this, "Saved.");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
