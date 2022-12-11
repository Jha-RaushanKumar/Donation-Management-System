/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donation;

import Configuration.EcoSystem;
import Donation.Employee.Employee;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.Role.DisasterReliefOrgAdminRole;
import Donation.Role.EducationDonationOrgAdminRole;
import Donation.Role.Role;
import Donation.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raushan
 */
public class DonationAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationAdminJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public DonationAdminJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateTableOrg();
        populateOrgTypes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrg = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboOrgType = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox();
        txtOrg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 54, 57));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(44, 54, 57));
        jPanel2.setLayout(null);

        tableOrg.setBackground(new java.awt.Color(220, 215, 224));
        tableOrg.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Name", "Orgnization Type", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrg);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 128, 955, 160);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 215, 201));
        jLabel5.setText("Organization List");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 160, 23);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(220, 215, 201));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization Type");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(210, 320, 190, 23);

        comboOrgType.setBackground(new java.awt.Color(220, 215, 224));
        comboOrgType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboOrgType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgTypeActionPerformed(evt);
            }
        });
        jPanel2.add(comboOrgType);
        comboOrgType.setBounds(460, 320, 260, 40);

        txtUserName.setBackground(new java.awt.Color(220, 215, 224));
        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtUserName);
        txtUserName.setBounds(460, 530, 260, 40);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(220, 215, 201));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Organization Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 470, 190, 23);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 215, 201));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Username");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(260, 540, 140, 23);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(220, 215, 201));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Role");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(290, 400, 110, 23);

        comboRole.setBackground(new java.awt.Color(220, 215, 224));
        comboRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboRole);
        comboRole.setBounds(460, 390, 260, 40);

        txtOrg.setEditable(false);
        txtOrg.setBackground(new java.awt.Color(220, 215, 224));
        txtOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgActionPerformed(evt);
            }
        });
        jPanel2.add(txtOrg);
        txtOrg.setBounds(460, 460, 260, 40);

        jButton1.setBackground(new java.awt.Color(220, 215, 201));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(470, 670, 110, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(220, 215, 201));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(270, 610, 140, 22);

        txtUserPassword.setEditable(false);
        txtUserPassword.setBackground(new java.awt.Color(220, 215, 224));
        txtUserPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtUserPassword);
        txtUserPassword.setBounds(460, 600, 260, 40);

        jButton2.setBackground(new java.awt.Color(220, 215, 201));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(800, 330, 110, 40);

        jTabbedPane1.addTab("Manage Organizations", jPanel2);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 215, 201));
        jLabel1.setText("Donation Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean val = true;
        int selectedRow = tableOrg.getSelectedRow();
        if(selectedRow<0){
            val=false;
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
        if(val){
            DefaultTableModel tableModel = (DefaultTableModel) tableOrg.getModel();
            Object org = tableModel.getValueAt(selectedRow, 0 );
            Organization.orgType orgType = (Organization.orgType) tableModel.getValueAt(selectedRow, 1 );
            ArrayList<Organization> organizationList = enterprise.getOrgDirectory().getOrgList();
            for(int i = 0; i < enterprise.getOrgDirectory().getOrgList().size(); i++){
                if((organizationList.get(i).getName().equals(String.valueOf(org))) && (organizationList.get(i).getOrgType() == orgType)){
                    enterprise.getOrgDirectory().getOrgList().remove(i);
                    populateTableOrg();
                    break;
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Organization.orgType orgtype = (Organization.orgType) comboOrgType.getSelectedItem();
        String name = txtUserName.getText().trim();
        String username = txtOrg.getText();
        String password = String.valueOf(txtUserPassword.getText());
        if(!name.isEmpty() && !password.isEmpty() && !username.isEmpty()){
            Organization org = enterprise.getOrgDirectory().addOrganization(orgtype, txtOrg.getText());
            if (orgtype == Organization.orgType.EducationDonationOrg) {
                if(org.getOrgType() == Organization.orgType.EducationDonationOrg){
                    Employee emp = org.getEmpDirectory().addEmployee(txtOrg.getText());
                    UserAccount useracc = org.getuserAccountList().addUserAccount(txtUserName.getText(), txtUserPassword.getText(), new EducationDonationOrgAdminRole(), emp);

                }
            }
            else if (orgtype == Organization.orgType.DisasterReliefOrg) {
                if(org.getOrgType() == Organization.orgType.DisasterReliefOrg){
                    Employee emp = org.getEmpDirectory().addEmployee(txtOrg.getText());
                    UserAccount useracc = org.getuserAccountList().addUserAccount(txtUserName.getText(), txtUserPassword.getText(), new DisasterReliefOrgAdminRole(), emp);

                }
            }

            JOptionPane.showMessageDialog(null, "Organization Created");
            txtUserName.setText("");
            txtUserPassword.setText("");
            txtOrg.setText("");
            comboOrgType.setSelectedIndex(0);

        } else{
            JOptionPane.showMessageDialog(null, "Please enter all details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        populateTableOrg();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgActionPerformed

    private void comboOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgTypeActionPerformed
        Organization.orgType orgtype = (Organization.orgType) comboOrgType.getSelectedItem();
        if(orgtype == Organization.orgType.DisasterReliefOrg){
            comboRole.removeAllItems();
            comboRole.addItem(Role.RoleType.DisasterReliefOrgAdminRole);
        }
        else if(orgtype == Organization.orgType.EducationDonationOrg){
            comboRole.removeAllItems();
            comboRole.addItem(Role.RoleType.EducationDonationOrgAdminRole);
        }
    }//GEN-LAST:event_comboOrgTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboOrgType;
    private javax.swing.JComboBox comboRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableOrg;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables

    public void populateOrgTypes() {
        comboOrgType.removeAllItems();
        comboOrgType.addItem(Organization.orgType.EducationDonationOrg);
        comboOrgType.addItem(Organization.orgType.DisasterReliefOrg);
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
                for(UserAccount useracc : org.getuserAccountList().getUaList()){
                    if(useracc.getRole().toString().equals(Role.RoleType.DisasterReliefOrgAdminRole.getValue())){
                        row[2] = useracc.getUsername();
                        row[3] = useracc.getPassword();
                    }
                    else if(useracc.getRole().toString().equals(Role.RoleType.EducationDonationOrgAdminRole.getValue())){
                        row[2] = useracc.getUsername();
                        row[3] = useracc.getPassword();
                    }
                }
                model.addRow(row);
            }
            }
        }
    }
    
}
