/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donor;

import Configuration.EcoSystem;
import Donation.Employee.Employee;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import static Donation.Organization.Organization.orgType.DonorIndividualOrg;
import Donation.Role.DonorRole;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.DonorRegistrationWorkRequest;
import Donation.WorkQueue.WorkQueue;
import Donation.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raushan
 */
public class DonorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorAdminJPanel
     */
     private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public DonorAdminJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateTable();
        populateTableOrg();
        
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
        tableRequestDonor = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        lblDonarName1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddOrganization = new javax.swing.JButton();
        lblDonarName2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTabbedPane1.setForeground(new java.awt.Color(2, 55, 108));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        tableRequestDonor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableRequestDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Request Date", "Requestor Name", "Organization Type", "Address", "Contact", "Email Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableRequestDonor);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 128, 955, 160);

        btnProcess.setBackground(new java.awt.Color(2, 55, 108));
        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel2.add(btnProcess);
        btnProcess.setBounds(780, 320, 180, 40);

        lblDonarName1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName1.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName1.setText("Welcome Donor Admin");
        jPanel2.add(lblDonarName1);
        lblDonarName1.setBounds(10, 50, 1109, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 55, 108));
        jLabel4.setText("Donor List");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 100, 92, 22);

        jTabbedPane1.addTab("Manage work request", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(2, 55, 108));

        tableOrg.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 888, 194);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Organization List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 100, 152, 22);

        txtOrgName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtOrgName);
        txtOrgName.setBounds(460, 360, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 55, 108));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 360, 110, 22);

        btnAddOrganization.setBackground(new java.awt.Color(2, 55, 108));
        btnAddOrganization.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddOrganization);
        btnAddOrganization.setBounds(460, 450, 220, 40);

        lblDonarName2.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName2.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName2.setText("Welcome Donor Admin");
        jPanel1.add(lblDonarName2);
        lblDonarName2.setBounds(10, 50, 1109, 32);

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("Donor Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableRequestDonor.getSelectedRow();

        if (selectedRow >= 0) {
            DonorRegistrationWorkRequest wreq = (DonorRegistrationWorkRequest) tableRequestDonor.getValueAt(selectedRow, 0);
            if (wreq.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Donor processed already!");
                return;
            }
            else {
                wreq.setReceiver(userAccount);
                wreq.setStatus("Pending");
                if (wreq.getOrgType() == Organization.orgType.DonorIndividualOrg) {
                    System.out.println(enterprise.getOrgDirectory().getOrgList());
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        System.out.print(enterprise.getOrgDirectory());
                        System.out.print(Organization.orgType.DonorIndividualOrg);
                        if(org.getOrgType() == Organization.orgType.DonorIndividualOrg){
                            Employee emp = org.getEmpDirectory().addEmployee(wreq.getName());
                            System.out.print(emp.getName());
                            UserAccount ua = org.getuserAccountList().addUserAccount(wreq.getUserName(), wreq.getUserPassword(), new DonorRole(), emp);
                            System.out.print(ua);
                        }
                    }
                }
                wreq.setStatus("Completed");
                JOptionPane.showMessageDialog(null, "Donor account created.");
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
        String orgName = txtOrgName.getText().trim();
        Organization.orgType type = DonorIndividualOrg;
        if(!orgName.isEmpty()){
            Organization o = enterprise.getOrgDirectory().addOrganization(type, txtOrgName.getText());
            JOptionPane.showMessageDialog(null, "Organization created.");
            txtOrgName.setText("");

        } else{
            JOptionPane.showMessageDialog(null, "Please enter Organization name");
        }
        populateTableOrg();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDonarName1;
    private javax.swing.JLabel lblDonarName2;
    private javax.swing.JTable tableOrg;
    private javax.swing.JTable tableRequestDonor;
    private javax.swing.JTextField txtOrgName;
    // End of variables declaration//GEN-END:variables


    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableRequestDonor.getModel();
        model.setRowCount(0);

        if (enterprise.getWorkQueue() == null) {
            enterprise.setWorkQueue(new WorkQueue());
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkReqList()) {
            if (workRequest instanceof DonorRegistrationWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((DonorRegistrationWorkRequest) workRequest).getRequestDateTime());
                row[2] = ((DonorRegistrationWorkRequest) workRequest).getName();
                row[3] = ((DonorRegistrationWorkRequest) workRequest).getOrgType();
                row[4] = ((DonorRegistrationWorkRequest) workRequest).getUserAddress();
                row[5] = ((DonorRegistrationWorkRequest) workRequest).getUserContact();
                row[6] = ((DonorRegistrationWorkRequest) workRequest).getUserEmailId();
                row[7] = ((DonorRegistrationWorkRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }

    }
    private void populateTableOrg() {
        DefaultTableModel model = (DefaultTableModel) tableOrg.getModel();
        
        model.setRowCount(0);
            for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                Object[] row = new Object[1];
                row[0] = org.getName();
                model.addRow(row);
            }   
    }
}
