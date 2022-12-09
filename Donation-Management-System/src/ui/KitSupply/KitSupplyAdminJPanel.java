/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.KitSupply;

import Configuration.EcoSystem;
import Donation.Employee.Employee;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.Role.DisasterReliefKitSupplyManagerRole;
import Donation.Role.EducationKitSupplyManagerRole;
import Donation.Role.Role;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.DisasterReliefKitSupplyWorkRequest;
import Donation.WorkQueue.EducationKitSupplyWorkRequest;
import Donation.WorkQueue.WorkQueue;
import Donation.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raushan
 */
public class KitSupplyAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form KitSupplyAdminJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public KitSupplyAdminJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateTableOrg();
        populateBox();
        //populateWorkRequestTable();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboOrg = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox();
        txtOrg = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JTextField();
        buttonDelete = new javax.swing.JButton();
        lblDonarName1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDonarName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKits = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        buttonProcess = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 55, 108));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kit Supply Admin");

        jTabbedPane1.setForeground(new java.awt.Color(2, 55, 108));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(2, 55, 108));

        tableOrg.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)))));
        tableOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Name", "Organization Type", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 1050, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Organization List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 120, 180, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Organization Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 330, 170, 40);

        comboOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });
        jPanel1.add(comboOrg);
        comboOrg.setBounds(340, 330, 220, 40);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(760, 380, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 55, 108));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 460, 180, 40);

        buttonAdd.setBackground(new java.awt.Color(2, 55, 108));
        buttonAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setText("Add Organization");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdd);
        buttonAdd.setBounds(440, 510, 220, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 55, 108));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 390, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 55, 108));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 450, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 55, 108));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Role");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 390, 90, 40);

        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboRole);
        comboRole.setBounds(340, 390, 220, 40);
        jPanel1.add(txtOrg);
        txtOrg.setBounds(340, 460, 220, 40);
        jPanel1.add(txtUserPassword);
        txtUserPassword.setBounds(760, 450, 220, 40);

        buttonDelete.setBackground(new java.awt.Color(2, 55, 108));
        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDelete);
        buttonDelete.setBounds(910, 280, 150, 40);

        lblDonarName1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName1.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName1.setText("Welcome Inventory Admin");
        jPanel1.add(lblDonarName1);
        lblDonarName1.setBounds(10, 70, 1109, 32);

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lblDonarName.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName.setText("Welcome Inventory Admin");
        jPanel2.add(lblDonarName);
        lblDonarName.setBounds(10, 73, 1109, 32);

        tableKits.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableKits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Request Date", "Organization Type", "Quantity", "Donor Name", "Donor Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableKits);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(140, 160, 810, 110);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 55, 108));
        jLabel9.setText("Kits Request List");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 120, 180, 22);

        buttonProcess.setText("Process");
        buttonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessActionPerformed(evt);
            }
        });
        jPanel2.add(buttonProcess);
        buttonProcess.setBounds(850, 300, 70, 22);

        jTabbedPane1.addTab("Manage work request", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
        Organization.orgType orgType = (Organization.orgType) comboOrg.getSelectedItem();
        if(orgType == Organization.orgType.EducationKitSupplyOrg){
            comboRole.removeAllItems();
            comboRole.addItem(Role.RoleType.EducationKitSupplyManager);
        }
        else if(orgType == Organization.orgType.DisasterReliefKitSupplyOrg){
            comboRole.removeAllItems();
            comboRole.addItem(Role.RoleType.DisasterReliefKitSupplyManager);
        }
    }//GEN-LAST:event_comboOrgActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        String name = txtUserName.getText().trim();
        Organization.orgType orgType = (Organization.orgType) comboOrg.getSelectedItem();
        if(!name.isEmpty()){
            Organization org = enterprise.getOrgDirectory().addOrganization(orgType, txtOrg.getText());
            if (orgType == Organization.orgType.DisasterReliefKitSupplyOrg) {
                if(org.getOrgType() == Organization.orgType.DisasterReliefKitSupplyOrg){
                    Employee emp = org.getEmpDirectory().addEmployee(txtOrg.getText());
                    UserAccount useraccount = org.getuserAccountList().addUserAccount(txtUserName.getText(), txtUserPassword.getText(), new DisasterReliefKitSupplyManagerRole(), emp);
                    System.out.print(userAccount.getUsername());
                }
            }
            else if (orgType == Organization.orgType.EducationKitSupplyOrg) {
                if(org.getOrgType() == Organization.orgType.EducationKitSupplyOrg){
                    Employee emp = org.getEmpDirectory().addEmployee(txtOrg.getText());
                    UserAccount useraccount = org.getuserAccountList().addUserAccount(txtUserName.getText(), txtUserPassword.getText(), new EducationKitSupplyManagerRole(), emp);

                }
            }

            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            comboOrg.setSelectedIndex(0);
            txtUserName.setText("");
            txtUserPassword.setText("");
            txtOrg.setText("");
            

        } else{
            JOptionPane.showMessageDialog(null, "Enter Organization name");
        }
        populateTableOrg();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        boolean val = true;
        int selectedRow = tableOrg.getSelectedRow();
        if(selectedRow<0){
            val=false;
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        if(val){
            DefaultTableModel tableModel = (DefaultTableModel) tableOrg.getModel();
            Object org = tableModel.getValueAt(selectedRow, 0 );
            Organization.orgType type = (Organization.orgType) tableModel.getValueAt(selectedRow, 1 );
            ArrayList<Organization> list = enterprise.getOrgDirectory().getOrgList();
            for(int i = 0; i < list.size(); i++){
                if((list.get(i).getName().equals(String.valueOf(org))) && (list.get(i).getOrgType() == type)){
                    enterprise.getOrgDirectory().getOrgList().remove(i);
                    populateTableOrg();
                    break;
                }
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed.");
                return;
            }
            else {
                request.setReceiver(userAccount);
                request.setStatus("Processed to Donation Organization");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request processed to Donation Organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
    }//GEN-LAST:event_buttonProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonProcess;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDonarName;
    private javax.swing.JLabel lblDonarName1;
    private javax.swing.JTable tableKits;
    private javax.swing.JTable tableOrg;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables

    private void populateBox() {
        comboOrg.removeAllItems();
        comboOrg.addItem(Organization.orgType.DisasterReliefKitSupplyOrg);
        comboOrg.addItem(Organization.orgType.EducationKitSupplyOrg);
    }
    
    private void populateTableOrg() {
        DefaultTableModel model = (DefaultTableModel) tableOrg.getModel();
        
        model.setRowCount(0);
        for (Enterprise ent : network.getEnterpriseDirectory().getEntList()) {
            if(ent.getName().equals(enterprise.getName())){
                for(Organization org : ent.getOrgDirectory().getOrgList()){
                Object[] row = new Object[4];
                row[0] = org.getName();
                row[1] = org.getOrgType();
                for(UserAccount userAccount : org.getuserAccountList().getUaList()){
                    if(userAccount.getRole().toString().equals(Role.RoleType.DisasterReliefKitSupplyManager.getValue())){
                        row[2] = userAccount.getUsername();
                        row[3] = userAccount.getPassword();
                    }
                    else if(userAccount.getRole().toString().equals(Role.RoleType.EducationKitSupplyManager.getValue())){
                        row[2] = userAccount.getUsername();
                        row[3] = userAccount.getPassword();
                    }
                }
                model.addRow(row);
            }
            }
        }
    }
    
    public void populateTable() {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        DefaultTableModel model = (DefaultTableModel) tableKits.getModel();
        
        model.setRowCount(0);

        for(Organization organization : enterprise.getOrgDirectory().getOrgList()){
            if (organization.getWorkQueue() == null) {
                organization.setWorkQueue(new WorkQueue());
            }
            for (WorkRequest req : organization.getWorkQueue().getWorkReqList()) {

            if (req instanceof DisasterReliefKitSupplyWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = req;
                row[1] = formatter.format(((DisasterReliefKitSupplyWorkRequest) req).getRequestDateTime());
                row[2] = ((DisasterReliefKitSupplyWorkRequest) req).getOrgType();
                row[3] = ((DisasterReliefKitSupplyWorkRequest) req).getKitCount();
                row[4] = ((DisasterReliefKitSupplyWorkRequest) req).getName();
                row[5] = ((DisasterReliefKitSupplyWorkRequest) req).getType();
                row[6] = ((DisasterReliefKitSupplyWorkRequest) req).getStatus();

                model.addRow(row);
            }
            else if (req instanceof EducationKitSupplyWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = req;
                row[1] = formatter.format(((EducationKitSupplyWorkRequest) req).getRequestDateTime());
                row[2] = ((EducationKitSupplyWorkRequest) req).getOrgType();
                row[3] = ((EducationKitSupplyWorkRequest) req).getKitCount();
                row[4] = ((EducationKitSupplyWorkRequest) req).getName();
                row[5] = ((EducationKitSupplyWorkRequest) req).getType();
                row[6] = ((EducationKitSupplyWorkRequest) req).getStatus();

                model.addRow(row);
            }
        }
    }
    }
}
