/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Buyer;

import ui.Seller.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.components.ListingsCell;
import ui.components.PictureCell;
import ui.components.TagCell;

/**
 *
 * @author Ke
 */
public class ViewReport extends javax.swing.JPanel {

    /**
     * Creates new form FileJPanel
     */
    public JPanel container;
    public EcoSystem system;
    private UserAccount userAccount;
    AbstractQuestion course;
    //List<String> path = new ArrayList<>();
    String[] path = new String[10];
    int i = 0;
    String path1 ="";
    String path2 ="";
    String path3 ="";
    
    public ViewReport(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount, AbstractQuestion course) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.course = course;
        initCourses();
    }
    
    private void initCourses(){
        jPanel6.setLayout(new GridLayout(0,3));
        jPanel11.setLayout(new GridLayout(0,3));
        jPanel12.setLayout(new GridLayout(0,3));
        jPanel13.setLayout(new GridLayout(0,3));
        jPanel16.setLayout(new GridLayout(0,3));

        if(course.getTag1()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getTag1());
            jPanel6.add(cell);
        }
        if(course.getTag2()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getTag2());
            jPanel6.add(cell);
        }
        if(course.getTag3()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getTag3());
            jPanel6.add(cell);
        }
        if(course.getTag4()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getTag4());
            jPanel6.add(cell);
        }
        
        if(course.getLivingroom1()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom1());
            jPanel11.add(cell);
        }
        if(course.getLivingroom2()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom2());
            jPanel11.add(cell);
        }
        if(course.getLivingroom3()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom3());
            jPanel11.add(cell);
        }
        if(course.getLivingroom4()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom4());
            jPanel11.add(cell);
        }
        if(course.getLivingroom5()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom5());
            jPanel11.add(cell);
        }
        if(course.getLivingroom6()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom6());
            jPanel11.add(cell);
        }
        if(course.getLivingroom7()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom7());
            jPanel11.add(cell);
        }
        if(course.getLivingroom8()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getLivingroom8());
            jPanel11.add(cell);
        }
        
        if(course.getBedroom1()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom1());
            jPanel12.add(cell);
        }
        if(course.getBedroom2()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom2());
            jPanel12.add(cell);
        }
        if(course.getBedroom3()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom3());
            jPanel12.add(cell);
        }
        if(course.getBedroom4()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom4());
            jPanel12.add(cell);
        }
        if(course.getBedroom5()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom5());
            jPanel12.add(cell);
        }
        if(course.getBedroom6()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getBedroom6());
            jPanel12.add(cell);
        }
        
        if(course.getKitchen1()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getKitchen1());
            jPanel13.add(cell);
        }
        if(course.getKitchen2()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getKitchen2());
            jPanel13.add(cell);
        }
        if(course.getKitchen3()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getKitchen3());
            jPanel13.add(cell);
        }
        if(course.getKitchen4()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getKitchen4());
            jPanel13.add(cell);
        }
        if(course.getKitchen5()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getKitchen5());
            jPanel13.add(cell);
        }
        
        if(course.getToilet1()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getToilet1());
            jPanel16.add(cell);
        }
        if(course.getToilet2()!=null){
            TagCell cell = new TagCell(container,userAccount,system,course.getToilet2());
            jPanel16.add(cell);
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

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 148, 249));
        jLabel10.setText("View Report");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tag"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Living room facilities"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Bedroom facilities"));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Kitchen facilities"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(jPanel13);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Toilet facilities"));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane7.setViewportView(jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(986, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(735, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables

    private void copyFile(File f1, File f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
