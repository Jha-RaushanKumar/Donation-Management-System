/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Funds;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
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
public class FundsManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundsManagerJPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public FundsManagerJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFunds = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        tableFunds.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
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
        jScrollPane3.setBounds(40, 130, 840, 140);

        jLabelIncomingKit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIncomingKit.setText("Incoming funds");
        jPanel3.add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(10, 80, 110, 20);

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

        jLabel2.setText("Welcome Funds Manager");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(440, 50, 160, 16);

        jButton5.setText("Process");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(790, 310, 78, 22);

        btnReject.setBackground(new java.awt.Color(2, 55, 108));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        jPanel3.add(btnReject);
        btnReject.setBounds(630, 310, 123, 36);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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
                wreq.setStatus("Processed to Donation Organization");

                JOptionPane.showMessageDialog(null, "Request processed to Donation Organization.");
                populateTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to process.");
            return;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tableFunds.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            } else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            } else if (request.getStatus().equalsIgnoreCase("Processed to Donation Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already processed to Donation Organization.");
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Rejected");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request rejected");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to reject.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableFunds;
    // End of variables declaration//GEN-END:variables

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