/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.managerRole;

import business.building.Building;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.organization.AgentManagerOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.ManagerManagerRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haowenchang
 */

public class SelectAgentJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignBuilding
     */
    private JPanel userProcessContainer;
    private Building building;
    private EnterpriseDirectory enterprisedirectory;
    private UserAccount userAccount;
    public SelectAgentJpanel(JPanel userProcessContainer,Building building,EnterpriseDirectory enterprisedirectory, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.building = building;
        this.enterprisedirectory = enterprisedirectory;
        this.userAccount = useraccount;
        populateTable();
        address.setText(building.getAddress());
        cost.setText(String.valueOf(building.getCost()));
        name.setText(building.getName());
        level.setText(String.valueOf(building.getLevel()));
        nel.setText(String.valueOf(building.getNpl()));
        if(building.getPic() !=null){
            ImageIcon icon = new ImageIcon(building.getPic());
        icon.setImage(icon.getImage().getScaledInstance(198,156,Image.SCALE_DEFAULT));
        pic.setIcon(icon);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BackJBtn = new javax.swing.JButton();
        SendJBtn = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgents = new javax.swing.JTable();
        address = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        nel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(166, 166, 234));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 43, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cost:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 71, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 99, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Level:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 127, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number Each Level:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 155, -1, -1));

        BackJBtn.setText("<<<Back");
        BackJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJBtnActionPerformed(evt);
            }
        });
        add(BackJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 344, -1, -1));

        SendJBtn.setText("Send Request");
        SendJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendJBtnActionPerformed(evt);
            }
        });
        add(SendJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 344, 126, -1));

        pic.setBackground(new java.awt.Color(255, 255, 255));
        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 35, 198, 156));

        tbAgents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAgents);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 203, 516, 129));

        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setText("jLabel1");
        add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 43, -1, -1));

        cost.setForeground(new java.awt.Color(255, 255, 255));
        cost.setText("jLabel4");
        add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 71, -1, -1));

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("jLabel8");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 99, -1, -1));

        level.setForeground(new java.awt.Color(255, 255, 255));
        level.setText("jLabel9");
        add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 127, -1, -1));

        nel.setForeground(new java.awt.Color(255, 255, 255));
        nel.setText("jLabel10");
        add(nel, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 155, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel dtm=(DefaultTableModel)tbAgents.getModel();
        dtm.setRowCount(0);
        
        for(Enterprise enterprise: enterprisedirectory.getEnterpriseList()){
            if(String.valueOf(enterprise.getEnterpriseType()).equals("Agent")){
                Object row[]= new Object[dtm.getColumnCount()];
                row[0] = enterprise;
                dtm.addRow(row);
            }
        }
    }

    private void BackJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //backAction();

    }//GEN-LAST:event_BackJBtnActionPerformed

    private void SendJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendJBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = tbAgents.getSelectedRow();
        if(selectedrow>=0){
            //Building building = (Building)tbBuildings.getValueAt(selectedrow, 0);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to request this agent??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Enterprise agent = (Enterprise)tbAgents.getValueAt(selectedrow, 0);

                ManagerManagerRequest request = new ManagerManagerRequest();
//                System.out.println(request.getStatus());
                if(building.getAgent() == null){
                request.setBuilding(building);
                request.setSender(userAccount);
                building.setAgent(agent.toString());
                request.setStatus("Sent");
                
                Organization org = null;
                for (Organization organization : agent.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof AgentManagerOrganization){
                        org = organization;
                        break;
                    }
                }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkqueue().getWorkRequestList().add(request);
                    JOptionPane.showMessageDialog(null, "Request message sent");
                }
                else{
                    JOptionPane.showMessageDialog(null, "This agent does not have any manager to accept order yet");
                }
                /*SelectManageJpanel selectManageJpanel = new SelectManageJpanel(userProcessContainer,building, agent, userAccount);
                userProcessContainer.add("selectManageJpanel", selectManageJpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);*/
                }
                else{
                JOptionPane.showMessageDialog(null, "It has been sent");
            }
            }
            
        }
        else
            JOptionPane.showMessageDialog(null,"Please select any row");
    }//GEN-LAST:event_SendJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJBtn;
    private javax.swing.JButton SendJBtn;
    private javax.swing.JLabel address;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nel;
    private javax.swing.JLabel pic;
    private javax.swing.JTable tbAgents;
    // End of variables declaration//GEN-END:variables
}
