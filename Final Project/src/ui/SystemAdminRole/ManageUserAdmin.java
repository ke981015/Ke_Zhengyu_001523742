/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.UserAdminRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ke
 */
public class ManageUserAdmin extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageUserAdmin(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        enterpriseJTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        enterpriseJTable.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(51, 153, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(260, 130, 610, 220);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Network:");
        add(jLabel1);
        jLabel1.setBounds(400, 390, 70, 18);

        networkJComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(51, 153, 255));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(510, 390, 136, 24);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Username:");
        add(jLabel2);
        jLabel2.setBounds(390, 490, 90, 18);

        usernameJTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        usernameJTextField.setForeground(new java.awt.Color(51, 153, 255));
        add(usernameJTextField);
        usernameJTextField.setBounds(510, 480, 136, 28);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Enterprise:");
        add(jLabel3);
        jLabel3.setBounds(390, 440, 100, 18);

        enterpriseJComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(51, 153, 255));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(510, 430, 136, 28);

        submitJButton.setBackground(new java.awt.Color(51, 153, 255));
        submitJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(470, 640, 90, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Password:");
        add(jLabel4);
        jLabel4.setBounds(400, 540, 90, 18);

        nameJTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(51, 153, 255));
        add(nameJTextField);
        nameJTextField.setBounds(510, 580, 136, 28);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Name:");
        add(jLabel5);
        jLabel5.setBounds(420, 590, 50, 18);

        passwordJPasswordField.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        passwordJPasswordField.setForeground(new java.awt.Color(51, 153, 255));
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(510, 530, 134, 28);

        btnBack.setBackground(new java.awt.Color(51, 153, 255));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 700, 100, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Manage user admin");
        add(jLabel10);
        jLabel10.setBounds(40, 40, 230, 34);

        jLabel8.setText("—————————————————————————————————————————————————");
        add(jLabel8);
        jLabel8.setBounds(110, 80, 735, 18);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        if(username.equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Username.");
            return;
        }
        
        if(password.equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Password.");
            return;
        }
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Please input the Name.");
            return;
        }
        
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, new UserAdminRole());
        DB4OUtil.getInstance().storeSystem(system);
        populateTable();
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SystemAdminWorkArea home = new SystemAdminWorkArea(userProcessContainer, account, system);
        Router.getInstance(null).go(home);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
