/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Education;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Enterprise.Enterprise.EntType;
import Donation.Network.Network;
import Donation.Organization.EducationDonationOrg;
import Donation.Organization.EducationKitSupplyOrg;
import Donation.Organization.Organization;
import static Donation.Organization.Organization.orgType.EducationKitSupplyOrg;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.EducationKitSupplyWorkRequest;
import Donation.WorkQueue.FundsWorkRequest;
import Donation.WorkQueue.WorkRequest;
import Donation.WorkQueue.WorkQueue;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raushan
 */
public class EducationDonationOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EducationDonationOrgJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private Organization org;
    private static Network network;
    private static Enterprise enterprise;
    private EducationDonationOrg educationDonationOrg;
    private EducationKitSupplyOrg educationKitSupplyOrg;
    public EducationDonationOrgJPanel(EcoSystem ecosystem, Network network, Organization org,Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.org =org;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        this.educationDonationOrg = (EducationDonationOrg) org;
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType() == Enterprise.EntType.KitSupplyEntDirectory){
                for(Organization organization : e.getOrgDirectory().getOrgList()){
                    if(organization.getOrgType()== Organization.orgType.EducationKitSupplyOrg){
                        this.educationKitSupplyOrg = (EducationKitSupplyOrg) organization;
                    }}}}
        
        txtTotalFunds.setText(String.valueOf(educationDonationOrg.getTotalFunds()));
        
        txtTotalKits.setText(String.valueOf(educationDonationOrg.getTotalSupplyKits()));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFunds = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        buttonProcess = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKits = new javax.swing.JTable();
        jLabelIncomingKit1 = new javax.swing.JLabel();
        buttonProcessKits = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelInventoryOverview = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTotalFunds = new javax.swing.JTextField();
        jLabelInventoryOverview1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalKits = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tableFunds.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableFunds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Funds", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFunds);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 220, 900, 120);

        jLabelIncomingKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit.setText("Incoming Kits");
        jPanel1.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(20, 450, 178, 37);

        buttonProcess.setBackground(new java.awt.Color(2, 55, 108));
        buttonProcess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonProcess.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcess.setText("Process");
        buttonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessActionPerformed(evt);
            }
        });
        jPanel1.add(buttonProcess);
        buttonProcess.setBounds(810, 350, 130, 36);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(2, 55, 108));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Education Donation Org Admin");
        jPanel1.add(jLabelTitle);
        jLabelTitle.setBounds(10, 10, 940, 70);

        tableKits.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tableKits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Quantity", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableKits);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 480, 850, 130);

        jLabelIncomingKit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit1.setText("Incoming Funds");
        jPanel1.add(jLabelIncomingKit1);
        jLabelIncomingKit1.setBounds(20, 180, 178, 37);

        buttonProcessKits.setBackground(new java.awt.Color(2, 55, 108));
        buttonProcessKits.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonProcessKits.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcessKits.setText("Process");
        buttonProcessKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessKitsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonProcessKits);
        buttonProcessKits.setBounds(790, 640, 140, 36);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 120, 110, 90);

        jLabelInventoryOverview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview.setForeground(new java.awt.Color(2, 55, 108));
        jLabelInventoryOverview.setText("Total Donations collected for Education Charity Organization");
        jPanel1.add(jLabelInventoryOverview);
        jLabelInventoryOverview.setBounds(20, 110, 645, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Total Funds");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 160, 93, 22);
        jPanel1.add(txtTotalFunds);
        txtTotalFunds.setBounds(230, 160, 231, 23);

        jLabelInventoryOverview1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelInventoryOverview1.setText("Total Kits Donations collected for Education Charity Organization");
        jPanel1.add(jLabelInventoryOverview1);
        jLabelInventoryOverview1.setBounds(20, 380, 645, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setText("Total Kits");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 430, 75, 22);
        jPanel1.add(txtTotalKits);
        txtTotalKits.setBounds(230, 430, 240, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1077, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                if (req instanceof FundsWorkRequest) {
                    FundsWorkRequest fundRequest = (FundsWorkRequest) tableFunds.getValueAt(selectedRow, 0);
                    double amount = fundRequest.getFunds();
                    double totalFunds = educationDonationOrg.getTotalFunds() + amount;
                    educationDonationOrg.setTotalFunds(totalFunds);
                    txtTotalFunds.setText(String.valueOf(educationDonationOrg.getTotalFunds()));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Funds added to the organization");
                
            }
            else if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else {
                JOptionPane.showMessageDialog(null, "Please wait until Finance Team acceptance.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.");
            return;
        }
    }//GEN-LAST:event_buttonProcessActionPerformed

    private void buttonProcessKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessKitsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {

                if (req instanceof EducationKitSupplyWorkRequest) {
                    EducationKitSupplyWorkRequest fundRequest = (EducationKitSupplyWorkRequest) tableKits.getValueAt(selectedRow, 0);

                    double quantity = fundRequest.getKitCount();
                    double totalKits = educationDonationOrg.getTotalSupplyKits() + quantity;
                    educationDonationOrg.setTotalSupplyKits((int) totalKits);
                    txtTotalKits.setText(String.valueOf(educationDonationOrg.getTotalSupplyKits()));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please wait until Kit Supply team acceptance.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_buttonProcessKitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProcess;
    private javax.swing.JButton buttonProcessKits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelIncomingKit1;
    private javax.swing.JLabel jLabelInventoryOverview;
    private javax.swing.JLabel jLabelInventoryOverview1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableFunds;
    private javax.swing.JTable tableKits;
    private javax.swing.JTextField txtTotalFunds;
    private javax.swing.JTextField txtTotalKits;
    // End of variables declaration//GEN-END:variables

 public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tableFunds.getModel();
        model.setRowCount(0);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType()== EntType.FundsEntDirectory){
                for(Organization org : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType()== Organization.orgType.FundsOrg){
                        for (WorkRequest req : org.getWorkQueue().getWorkReqList()) {
                            if (req instanceof FundsWorkRequest) {
                                Object[] row = new Object[model.getColumnCount()];
                                row[0] = req;
                                row[1] = formatter.format(((FundsWorkRequest) req).getRequestDateTime());
                                row[2] = ((FundsWorkRequest) req).getFunds();
                                row[3] = ((FundsWorkRequest) req).getName();
                                row[4] = ((FundsWorkRequest) req).getType();
                                row[5] = ((FundsWorkRequest) req).getStatus();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
        
        
        DefaultTableModel model1 = (DefaultTableModel) tableKits.getModel();

        model1.setRowCount(0);

        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType()== EntType.KitSupplyEntDirectory){
                for(Organization org : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType()== Organization.orgType.EducationKitSupplyOrg){
                        for (WorkRequest workReq : org.getWorkQueue().getWorkReqList()) {

                           if (workReq instanceof EducationKitSupplyWorkRequest) {
                            Object[] row = new Object[model1.getColumnCount()];
                            row[0] = workReq;
                            row[1] = formatter.format(((EducationKitSupplyWorkRequest) workReq).getRequestDateTime());
                            row[2] = ((EducationKitSupplyWorkRequest) workReq).getKitCount();
                            row[3] = ((EducationKitSupplyWorkRequest) workReq).getName();
                            row[4] = ((EducationKitSupplyWorkRequest) workReq).getType();
                            row[5] = ((EducationKitSupplyWorkRequest) workReq).getStatus();

                            model1.addRow(row);
                        }
                    }
                    }
                }
            }
        }
        

    }


}
