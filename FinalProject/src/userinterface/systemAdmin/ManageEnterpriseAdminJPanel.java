/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.systemAdmin;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.AgentAdminRole;
import business.role.CompanyAdminRole;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /** Creates new form ManageEnterpriseAdminJPanel */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
        //populateEnterpriseComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getCityName();
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(166, 166, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 523, 160));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Network");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 136, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));
        jPanel1.add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 136, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enterprise");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 136, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 136, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));
        jPanel1.add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 137, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Create Enterprise Admin Account");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
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
        
        if(usernameJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "username cannot be empty");
            return;
        }
        if(passwordJPasswordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "passowrd cannot be empty");
            return;
        }
        if(nameJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "name cannot be empty");
            return;
        }
        Boolean exist = false;
        for(Network network: system.getNetworkList()){
            for(Enterprise enter: network.getEnterpriseDirectory().getEnterpriseList()){
                for(UserAccount adminuser: enter.getUserAccountDirectory().getUserAccountList()){
                    if(adminuser.getUsername().equals(username)||username.equals("sysadmin")){
                        JOptionPane.showMessageDialog(null, "User Already Exist");
                        exist = true;
                        return;
                    }
                }
                for(Organization organ: enter.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount organuser: organ.getUserAccountDirectory().getUserAccountList()){
                        if(organuser.getUsername().toString().equals(username)||username.equals("sysadmin")){
                            JOptionPane.showMessageDialog(null, "User Already Exist");
                            exist = true;
                            return;
                        }
                    }
                    
                }
            }
        }
        if(!exist){
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            if(enterprise.getEnterpriseType().getValue().equals("Company")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new CompanyAdminRole());
            populateTable();

            }
            else if(enterprise.getEnterpriseType().getValue().equals("Agent")){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AgentAdminRole());
            populateTable();
            }
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables

}
