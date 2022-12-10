/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Funds;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.FundsWorkRequest;
import Donation.WorkQueue.WorkQueue;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raushan
 */
public class DonateFundsPanel extends javax.swing.JFrame {

    /**
     * Creates new form DonateFundsPanel
     */
    private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public DonateFundsPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.userAccount = userAccount;
        populateOrg();
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
        comboOrg = new javax.swing.JComboBox();
        txtAmount = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 750));
        jPanel1.setLayout(null);

        comboOrg.setBackground(new java.awt.Color(220, 215, 224));
        comboOrg.setEditable(true);
        comboOrg.setFont(new java.awt.Font("Cambay Devanagari", 0, 18)); // NOI18N
        comboOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboOrg);
        comboOrg.setBounds(370, 140, 264, 50);

        txtAmount.setBackground(new java.awt.Color(220, 215, 224));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountKeyPressed(evt);
            }
        });
        jPanel1.add(txtAmount);
        txtAmount.setBounds(370, 300, 264, 50);

        txtPurpose.setBackground(new java.awt.Color(220, 215, 224));
        txtPurpose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtPurpose);
        txtPurpose.setBounds(370, 220, 264, 50);

        jLabel6.setFont(new java.awt.Font("PT Serif", 0, 62)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 215, 201));
        jLabel6.setText("Donate Funds");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 30, 450, 60);

        jButton1.setFont(new java.awt.Font("PT Sans", 0, 18)); // NOI18N
        jButton1.setText("Donate");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 430, 170, 50);

        jButton3.setText("Back");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 580, 130, 50);

        jLabel1.setText("Name of Organization");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 150, 200, 50);

        jLabel5.setText("Reason");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 230, 180, 40);

        jLabel7.setText("Amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 307, 160, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) comboOrg.getSelectedItem();
        Organization.orgType type = organization.getOrgType();

        if (txtAmount.getText().isEmpty()
                || type == null || (!txtAmount.getText().matches("[0-9]+")) || txtPurpose.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Provide all valid Details(Amount in dollars).","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            FundsWorkRequest freq = new FundsWorkRequest();
            freq.setFunds(Double.parseDouble(txtAmount.getText()));

            freq.setName(userAccount.getEmployee().getName());
            freq.setType(userAccount.getRole().toString());
            freq.setStatus("Donated");
            freq.setRequestDateTime(new Date());
            freq.setEnterprise(enterprise);
            freq.setNetwork(network);
            freq.setOrgType(type);

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEntList()) {
                if (enterprise.getEntType() == Enterprise.EntType.FundsEntDirectory) {
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org.getOrgType() == Organization.orgType.FundsOrg){
                            if (org.getWorkQueue() == null) {
                                org.setWorkQueue(new WorkQueue());
                            }
                            org.getWorkQueue().getWorkReqList().add(freq);

                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Thank you for donating funds!");
            txtAmount.setText("");
            comboOrg.setSelectedIndex(0);
            txtPurpose.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonateFundsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonateFundsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonateFundsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonateFundsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonateFundsPanel(ecosystem, network, enterprise, jPanel, userAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPurpose;
    // End of variables declaration//GEN-END:variables

    private void populateOrg() {
        comboOrg.removeAllItems();
        
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEntList()){
            if(enterprise.getEntType().toString().equals(Enterprise.EntType.DonationEntDirectory.toString())){
                for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        comboOrg.addItem(org);
                }
            }    
        }
    }
}
