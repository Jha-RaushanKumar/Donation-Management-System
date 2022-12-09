/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DisasterRelief;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Enterprise.Enterprise.EntType;
import Donation.Network.Network;
import Donation.Organization.DisasterReliefKitSupplyOrg;
import Donation.Organization.DisasterReliefOrg;
import Donation.Organization.EducationDonationOrg;
import Donation.Organization.Organization;
import static Donation.Organization.Organization.orgType.DisasterReliefKitSupplyOrg;
import static Donation.Organization.Organization.orgType.EducationKitSupplyOrg;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.DisasterReliefKitSupplyWorkRequest;
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
 * @author swapnilbiradar
 */
public class DisasterReliefOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisasterReliefOrgJPanel
     * 
     */
    
     private  JPanel jPanel;
    private  UserAccount userAccount;
    private Organization org;
    private  Network network;
    private  Enterprise enterprise;
    private  DisasterReliefOrg disasterReliefOrg;
    private DisasterReliefKitSupplyOrg disasterReliefKitSupplyOrg;
  
    public DisasterReliefOrgJPanel(UserAccount userAccount, Enterprise enterprise, Organization org, Network network) {
        initComponents();
        this.userAccount =userAccount;
        this.enterprise = enterprise;
        this.org =org;
        this.network = network;
        this.disasterReliefOrg = (DisasterReliefOrg) org;
        txtTotalFunds.setText(String.valueOf(disasterReliefOrg.getTotalFunds()));
        
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType() == EntType.KitSupplyEntDirectory){
                for(Organization organization : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType()== Organization.orgType.DisasterReliefKitSupplyOrg){
                        this.disasterReliefKitSupplyOrg = (DisasterReliefKitSupplyOrg) org;
                    }}}}
        
        txtTotalKits.setText(String.valueOf(disasterReliefKitSupplyOrg.getTotalSupplyKits()));
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
        jLabelSupplyKitOverview = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotalFunds = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKits = new javax.swing.JTable();
        jLabelIncomingFunds = new javax.swing.JLabel();
        jLabelSupplyKitOverview1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalKits = new javax.swing.JTextField();
        btnProcessKit = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), null)));

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
        jScrollPane1.setBounds(120, 140, 943, 177);

        jLabelIncomingKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit.setText("Incoming Kits");
        jPanel1.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(130, 540, 178, 37);

        jLabelSupplyKitOverview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSupplyKitOverview.setForeground(new java.awt.Color(2, 55, 108));
        jLabelSupplyKitOverview.setText("Total Donations collected for Disaster Welfare Charity Organization");
        jPanel1.add(jLabelSupplyKitOverview);
        jLabelSupplyKitOverview.setBounds(120, 390, 645, 37);

        btnProcess.setBackground(new java.awt.Color(2, 55, 108));
        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcess);
        btnProcess.setBounds(940, 330, 123, 36);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Total Funds");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 440, 120, 22);

        txtTotalFunds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTotalFunds);
        txtTotalFunds.setBounds(300, 440, 231, 30);

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), null));

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
        jScrollPane2.setBounds(120, 580, 953, 175);

        jLabelIncomingFunds.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingFunds.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingFunds.setText("Incoming Funds");
        jPanel1.add(jLabelIncomingFunds);
        jLabelIncomingFunds.setBounds(120, 100, 178, 37);

        jLabelSupplyKitOverview1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSupplyKitOverview1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelSupplyKitOverview1.setText("Total Kits Donations collected for Disaster Welfare Charity Organization");
        jPanel1.add(jLabelSupplyKitOverview1);
        jLabelSupplyKitOverview1.setBounds(130, 810, 643, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Kits");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 870, 100, 22);

        txtTotalKits.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtTotalKits);
        txtTotalKits.setBounds(310, 870, 231, 30);

        btnProcessKit.setBackground(new java.awt.Color(2, 55, 108));
        btnProcessKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcessKit.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessKit.setText("Process");
        btnProcessKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessKitActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcessKit);
        btnProcessKit.setBounds(950, 770, 123, 36);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(2, 55, 108));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Disaster Relief Charity Admin");
        jPanel1.add(jLabelTitle);
        jLabelTitle.setBounds(120, 20, 940, 35);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 90, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Donated")) {
                JOptionPane.showMessageDialog(null, "Please wait until Finance Team acceptance.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
           
            else {
                if (req instanceof FundsWorkRequest) {
                    FundsWorkRequest fundRequest = (FundsWorkRequest) tableFunds.getValueAt(selectedRow, 0);
                    double amount = fundRequest.getFunds();
                    double totalFunds = disasterReliefOrg.getTotalFunds() + amount;
                    disasterReliefOrg.setTotalFunds(totalFunds);
                    txtTotalFunds.setText(String.valueOf(disasterReliefOrg.getTotalFunds()));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed and funds added to the organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnProcessKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessKitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest req = (WorkRequest) tableKits.getValueAt(selectedRow, 0);
            if (req.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (req.getStatus().equalsIgnoreCase("Forwarded to Charity Organization")) {

                if (req instanceof DisasterReliefKitSupplyWorkRequest) {
                    DisasterReliefKitSupplyWorkRequest fundRequest = (DisasterReliefKitSupplyWorkRequest) tableKits.getValueAt(selectedRow, 0);

                    int quantity = (int) fundRequest.getKitCount();
                    int totalKits = disasterReliefOrg.getTotalSupplyKits()+ quantity;
                    disasterReliefOrg.setTotalSupplyKits(totalKits);
                    txtTotalKits.setText(String.valueOf(disasterReliefOrg.addTotalSupplyKits(WIDTH)));
                }
                req.setReceiver(userAccount);
                req.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please wait until Supply Kit team acceptance.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnProcessKitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProcessKit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIncomingFunds;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelSupplyKitOverview;
    private javax.swing.JLabel jLabelSupplyKitOverview1;
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
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest workReq : org.getWorkQueue().getWorkReqList()) {

            if (workReq instanceof FundsWorkRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workReq;
                row[1] = formatter.format(((FundsWorkRequest) workReq).getRequestDateTime());
                row[2] = ((FundsWorkRequest) workReq).getFunds();
                row[3] = ((FundsWorkRequest) workReq).getName();
                row[4] = ((FundsWorkRequest) workReq).getType();
                row[5] = ((FundsWorkRequest) workReq).getStatus();

                model.addRow(row);
            }
        }
        
        DefaultTableModel model1 = (DefaultTableModel) tableKits.getModel();

        model1.setRowCount(0);

        if (org.getWorkQueue() == null) {
            org.setWorkQueue(new WorkQueue());
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEntList()){
            if(e.getEntType() == EntType.KitSupplyEntDirectory){
                for(Organization org : e.getOrgDirectory().getOrgList()){
                    if(org.getOrgType() == Organization.orgType.DisasterReliefKitSupplyOrg){
                        for (WorkRequest workReq : org.getWorkQueue().getWorkReqList()) {

                           if (workReq instanceof DisasterReliefKitSupplyWorkRequest) {
                            Object[] row = new Object[model1.getColumnCount()];
                            row[0] = workReq;
                            row[1] = formatter.format(((DisasterReliefKitSupplyWorkRequest) workReq).getRequestDateTime());
                            row[2] = ((DisasterReliefKitSupplyWorkRequest) workReq).getKitCount();
                            row[3] = ((DisasterReliefKitSupplyWorkRequest) workReq).getName();
                            row[4] = ((DisasterReliefKitSupplyWorkRequest) workReq).getType();
                            row[5] = ((DisasterReliefKitSupplyWorkRequest) workReq).getStatus();

                            model1.addRow(row);
                        }
                    }
                    }
                }
            }
        }
        

    }

}
