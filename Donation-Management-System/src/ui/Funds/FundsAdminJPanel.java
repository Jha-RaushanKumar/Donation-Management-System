/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Funds;

import Configuration.EcoSystem;
import Donation.Employee.Employee;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.FundsOrg;
import Donation.Organization.Organization;
import static Donation.Organization.Organization.orgType.FundsOrg;
import Donation.Role.FundsOrgAdminRole;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.FundsWorkRequest;
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
public class FundsAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundsAdminJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public FundsAdminJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        txtUserName = new javax.swing.JTextField();
        txtOrg = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFunds = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 54, 57));

        jTabbedPane1.setBackground(new java.awt.Color(220, 215, 201));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(220, 215, 201));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setToolTipText("");

        tblOrg.setBackground(new java.awt.Color(220, 215, 224));
        tblOrg.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 80, 950, 140);

        txtUserName.setBackground(new java.awt.Color(220, 215, 224));
        jPanel1.add(txtUserName);
        txtUserName.setBounds(410, 340, 220, 40);

        txtOrg.setBackground(new java.awt.Color(220, 215, 224));
        jPanel1.add(txtOrg);
        txtOrg.setBounds(410, 260, 220, 40);

        txtUserPassword.setBackground(new java.awt.Color(220, 215, 224));
        jPanel1.add(txtUserPassword);
        txtUserPassword.setBounds(410, 420, 220, 40);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 420, 90, 23);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Username");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 350, 100, 23);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Organization Name");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(160, 270, 180, 23);

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("List of Organization");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 33, 200, 30);

        jButton6.setBackground(new java.awt.Color(220, 215, 201));
        jButton6.setText("Add Organization");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(440, 490, 170, 40);

        jTabbedPane1.addTab(" Organizations", jPanel1);

        jPanel3.setBackground(new java.awt.Color(44, 54, 57));
        jPanel3.setLayout(null);

        tableFunds.setBackground(new java.awt.Color(220, 215, 224));
        tableFunds.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableFunds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Organization Type", "Funds", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableFunds);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(30, 130, 840, 140);

        jLabelIncomingKit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(220, 215, 201));
        jLabelIncomingKit.setText("Funds Requests:");
        jPanel3.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(30, 80, 190, 29);

        btnAccept.setBackground(new java.awt.Color(2, 55, 108));
        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel3.add(btnAccept);
        btnAccept.setBounds(1010, 320, 123, 36);

        jButton5.setBackground(new java.awt.Color(220, 215, 201));
        jButton5.setText("Process");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(758, 310, 110, 50);

        jTabbedPane1.addTab(" Requests", jPanel3);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 215, 201));
        jLabel1.setText("Welcome Funds Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String name = txtOrg.getText().trim();
        String username = txtUserName.getText();
        String password = String.valueOf(txtUserPassword.getText());
        
        Organization.orgType type = FundsOrg;
        if(!name.isEmpty() && !password.isEmpty() && !username.isEmpty()){
            Organization organization = enterprise.getOrgDirectory().addOrganization(type, txtOrg.getText());
            Employee emp = organization.getEmpDirectory().addEmployee(txtOrg.getText());
            UserAccount user = organization.getuserAccountList().addUserAccount(txtUserName.getText(), txtUserPassword.getText(), new FundsOrgAdminRole(), emp);
            JOptionPane.showMessageDialog(null, "Organization created.");
            txtUserName.setText("");
            txtUserPassword.setText("");
            txtOrg.setText("");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter Organization name", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        populateTableOrg();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            FundsWorkRequest wreq = (FundsWorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (wreq.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Funds processed already.");
                return;
            }
            else if (wreq.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Funds rejected already.");
                return;
            }
            else if (wreq.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to Donation Organization.");
                return;
            }
            else {
                wreq.setReceiver(userAccount);
                wreq.setStatus("Processed to Finance Manager");

                JOptionPane.showMessageDialog(null, "Request processed to Finance Manager.");
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableFunds;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables

    private void populateTableOrg() {
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
            for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                Object[] row = new Object[1];
                row[0] = org.getName();
                model.addRow(row);
            }   
    }
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableFunds.getModel();
        model.setRowCount(0);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        for (Organization organization : enterprise.getOrgDirectory().getOrgList()) {
            if (organization.getWorkQueue() == null) {
                organization.setWorkQueue(new WorkQueue());
            }
            for (WorkRequest req : organization.getWorkQueue().getWorkReqList()) {
                if (req instanceof FundsWorkRequest) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = req;
                    row[1] = formatter.format(((FundsWorkRequest) req).getRequestDateTime());
                    row[2] = ((FundsWorkRequest) req).getOrgType();
                    row[3] = ((FundsWorkRequest) req).getFunds();
                    row[4] = ((FundsWorkRequest) req).getName();
                    row[5] = ((FundsWorkRequest) req).getType();
                    row[6] = ((FundsWorkRequest) req).getStatus();

                    model.addRow(row);
                }
            }
        }

    }
}
