/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seller;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.components.PictureCell;

/**
 *
 * @author Ke
 */
public class ListingInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FileJPanel
     */
    public JPanel container;
    public EcoSystem system;
    private UserAccount userAccount;
    //List<String> path = new ArrayList<>();
    String[] path = new String[10];
    int i = 0;
    
    public ListingInfoJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
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
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAd1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAd2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtRent = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPh = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDashBoard = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboState = new javax.swing.JComboBox<>();
        ComboCity = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        ComboOri = new javax.swing.JComboBox<>();
        txtBath = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBed = new javax.swing.JTextField();
        txtLiving = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFl = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 148, 249));
        jLabel10.setText("Create a new listing");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 45, -1, -1));

        jLabel8.setText("—————————————————————————————————————————————————");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 86, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("State:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 160, 49, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 153, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Address line1:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 157, -1, -1));
        add(txtAd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 157, 390, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 153, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Address line2:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 212, -1, -1));
        add(txtAd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 209, 390, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 153, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Expected rent:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 121, -1));
        add(txtRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 130, -1));

        jRadioButton1.setText("YES");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 153, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Area:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 89, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 89, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 450, 100, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Phone:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 89, -1));

        txtPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhActionPerformed(evt);
            }
        });
        txtPh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhKeyPressed(evt);
            }
        });
        add(txtPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 190, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 760, 330, -1));

        btnDashBoard.setBackground(new java.awt.Color(255, 204, 204));
        btnDashBoard.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDashBoard.setForeground(new java.awt.Color(102, 153, 255));
        btnDashBoard.setText("Upload dash board view");
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });
        add(btnDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 760, -1, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 153, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("City:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 212, 49, -1));
        add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 270, 100, -1));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contentPanel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 870, 230));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Elevator:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 60, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Orientation:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 90, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Unit type:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 74, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Floor:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        ComboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "Massachusetts", "New Jersey", "New York" }));
        ComboState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboStateActionPerformed(evt);
            }
        });
        add(ComboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 157, -1, -1));

        ComboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Los Angeles", "Hollywood", "Compton", "San Francisco" }));
        add(ComboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 209, -1, -1));

        jLabel23.setForeground(new java.awt.Color(102, 153, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("㎡");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 20, -1));

        ComboOri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "East", "South", "West", "North" }));
        add(ComboOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 330, 134, -1));
        add(txtBath, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 30, -1));

        jLabel9.setText("bathroom");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));
        add(txtBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 30, -1));
        add(txtLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, -1));

        jLabel11.setText("bedroom");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        jLabel12.setText("living room");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));
        add(txtFl, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 390, 100, -1));

        jLabel24.setForeground(new java.awt.Color(102, 153, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("$ (every year)");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 120, -1));

        jRadioButton2.setText("NO");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        jLabel25.setForeground(new java.awt.Color(102, 153, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("F");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 20, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        WorkRequest car = new WorkRequest();
        car.setState(ComboState.getSelectedItem().toString());
        car.setCity(ComboCity.getSelectedItem().toString());
        
        if(txtAd1.getText()==null||txtAd2.getText()==null){
            JOptionPane.showMessageDialog(this, "Please enter the Address.");
            return;
        }
        car.setAddress1(txtAd1.getText());
        car.setAddress2(txtAd2.getText());
        
        try{
            car.setArea(Double.parseDouble(txtArea.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter the correct type in Area.");
            return;
        }
        
        car.setOrientation(ComboOri.getSelectedItem().toString());
        
        try{
            car.setBedroom(Integer.parseInt(txtBed.getText()));
            car.setLivingroom(Integer.parseInt(txtLiving.getText()));
            car.setBathroom(Integer.parseInt(txtBath.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter the correct type in Unit type.");
            return;
        }
        
        try{
            car.setFloor(Integer.parseInt(txtFl.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter the correct type in Floor.");
            return;
        }
        
        if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Please choose whether there is an elevator.");
        }
        else{
            if(jRadioButton1.isSelected())
                car.setElevator(true);
            else if(jRadioButton2.isSelected())
                car.setElevator(false);
        }
        
        try{
            car.setRent(Double.parseDouble(txtRent.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter the correct type in Expected rent.");
            return;
        }
        
        if(txtName.getText()==null){
            JOptionPane.showMessageDialog(this, "Please enter the Name.");
            return;
        }
        car.setName(txtName.getText());
        
        
        if(txtPh.getText()==null){
            JOptionPane.showMessageDialog(this, "Please enter the Phone.");
            return;
        }
        if(txtPh.getText().length()!=16){
            JOptionPane.showMessageDialog(this, "Please enter the correct type in Phone.");
            return;
        }
        car.setPhone(txtPh.getText());
        
        system.getWorkQueue().getWorkRequestList().add(car);
        DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(this, "Used car information saved.");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("please choose a pic","img","png");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(null);
        //File file=chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION){
            String name = chooser.getSelectedFile().getPath();
            if(name==""||name==null){
                return;
            }
            //ImageIcon icon = new ImageIcon(name);
            //Image image = icon.getImage();
            //Image newImage = image.getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_DEFAULT);
            //System.out.println(img2.getWidth()+""+img2.getHeight());
            //icon.setImage(newImage);
            //img2.setIcon(icon);
            contentPanel.setLayout(new GridLayout(0,2));
            PictureCell cell = new PictureCell(container,userAccount,system,name);
            contentPanel.add(cell);
            updateUI();
            //path.set(i, name);
            path[i] = name;
            i++;
        }
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void ComboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboStateActionPerformed
        // TODO add your handling code here:
        if(ComboState.getSelectedItem().equals("California")){
            ComboCity.removeAllItems();
            ComboCity.addItem("Los Angeles");
            ComboCity.addItem("Hollywood");
            ComboCity.addItem("Compton");
            ComboCity.addItem("San Francisco");
        }
        if(ComboState.getSelectedItem().equals("Massachusetts")){
            ComboCity.removeAllItems();
            ComboCity.addItem("Boston");
            ComboCity.addItem("Lowell");
            ComboCity.addItem("Quincy");
            ComboCity.addItem("Lynn");
        }
        if(ComboState.getSelectedItem().equals("New Jersey")){
            ComboCity.removeAllItems();
            ComboCity.addItem("Newark");
            ComboCity.addItem("Jersey City");
            ComboCity.addItem("Paterson");
            ComboCity.addItem("Elizabeth");
        }
        if(ComboState.getSelectedItem().equals("New York")){
            ComboCity.removeAllItems();
            ComboCity.addItem("New York City");
            ComboCity.addItem("Buffalo");
            ComboCity.addItem("Rochester");
            ComboCity.addItem("Albany");
        }

            
    }//GEN-LAST:event_ComboStateActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhActionPerformed

    }//GEN-LAST:event_txtPhActionPerformed

    private void txtPhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhKeyPressed
        // TODO add your handling code here:
        if(txtPh.getText().length()==3)
            txtPh.setText(txtPh.getText()+" - ");
        if(txtPh.getText().length()==9)
            txtPh.setText(txtPh.getText()+" - ");
    }//GEN-LAST:event_txtPhKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCity;
    private javax.swing.JComboBox<String> ComboOri;
    private javax.swing.JComboBox<String> ComboState;
    private javax.swing.JButton btnDashBoard;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAd1;
    private javax.swing.JTextField txtAd2;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBath;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtFl;
    private javax.swing.JTextField txtLiving;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPh;
    private javax.swing.JTextField txtRent;
    // End of variables declaration//GEN-END:variables

}
