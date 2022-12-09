/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.KitSupply;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.UserAccount.UserAccount;
import Donation.WorkQueue.DisasterReliefKitSupplyWorkRequest;
import Donation.WorkQueue.WorkQueue;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author reeteshkesarwani
 */
public class DonateDisasterKitSupplyJPanel extends javax.swing.JFrame {

    /**
     * Creates new form DonateDisasterKitSupplyJPanel
     */
      private static JPanel jPanel;
    private static UserAccount userAccount;
    private static EcoSystem ecosystem;
    private static Network network;
    private static Enterprise enterprise;
    public DonateDisasterKitSupplyJPanel(EcoSystem ecosystem, Network network, Enterprise enterprise, JPanel jPanel, UserAccount userAccount) {
      initComponents();
        this.userAccount = userAccount;
        this.network = network;
        this.enterprise = enterprise;
        this.jPanel = jPanel;
        this.ecosystem=ecosystem;
        populateBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBack = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        buttonSubmit = new javax.swing.JButton();
        comboDisOrg = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonBack.setText("Back");

        jLabel1.setText("Donate Kit Supply for Disaster");

        jLabel2.setText("Enter Disaster Organization");

        jLabel3.setText("Count");

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        comboDisOrg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboDisOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(buttonBack)
                .addGap(205, 205, 205)
                .addComponent(jLabel1)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCount)
                            .addComponent(buttonSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(242, 242, 242))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(comboDisOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(buttonBack))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboDisOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(buttonSubmit)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
          Organization org = (Organization) comboDisOrg.getSelectedItem();
        Organization.orgType type = org.getOrgType();

        if (txtCount.getText().isEmpty()
                || type == null) {
            JOptionPane.showMessageDialog(null, "Please Provide all the Details.");
        } 
        else {
            DisasterReliefKitSupplyWorkRequest req = new DisasterReliefKitSupplyWorkRequest();
            req.setRequestDateTime(new Date());
            req.setEnterprise(enterprise);
            req.setNetwork(network);
            req.setKitCount(Integer.parseInt(txtCount.getText()));
            req.setName(userAccount.getEmployee().getName());
            req.setType(userAccount.getRole().toString());
            req.setStatus("Donated");
            req.setOrgType(type);
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEntList()) {
                if(enterprise.getEntType()== Enterprise.EntType.KitSupplyEntDirectory){
                    for(Organization organization : enterprise.getOrgDirectory().getOrgList()){
                        if(organization.getOrgType()== Organization.orgType.DisasterReliefKitSupplyOrg){
                            if (organization.getWorkQueue() == null) {
                                organization.setWorkQueue(new WorkQueue());
                            }
                            organization.getWorkQueue().getWorkReqList().add(req);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Thank you for your donation!");
            txtCount.setText("");
            comboDisOrg.setSelectedIndex(0);
         
        }
    }//GEN-LAST:event_buttonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(DonateDisasterKitSupplyJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonateDisasterKitSupplyJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonateDisasterKitSupplyJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonateDisasterKitSupplyJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonateDisasterKitSupplyJPanel( ecosystem,  network,  enterprise,  jPanel,  userAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonBack;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox comboDisOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCount;
    // End of variables declaration//GEN-END:variables

    private void populateBox() {
           comboDisOrg.removeAllItems();
        for (Enterprise ent : network.getEnterpriseDirectory().getEntList()) {
            if (ent.getEntType().toString().equals(Enterprise.EntType.DonationEntDirectory.toString())) {
                for (Organization organization : ent.getOrgDirectory().getOrgList()) {
                    if (organization.getOrgType().toString().equals(Organization.orgType.DisasterReliefOrg.toString())) {
                        comboDisOrg.addItem(organization.toString());
                    }
                }
            }

        }
        
    }
}
