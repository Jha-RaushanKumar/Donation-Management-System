/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Configuration.EcoSystem;
import Donation.DB4OUtil;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.Role.DonationAdminRole;
import Donation.Role.DonorAdminRole;
import Donation.Role.DonorRole;
import Donation.Role.FundsAdminRole;
import Donation.Role.KitSupplyAdmin;
import Donation.Role.SystemAdminRole;
import Donation.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import ui.Donation.DonationAdminJPanel;
import ui.Donor.DonorAdminJPanel;
import ui.Donor.DonorJPanel;
import ui.Donor.RegistrationDonorJPanel;
import ui.Funds.FundsAdminJPanel;
import ui.KitSupply.KitSupplyAdminJPanel;
import ui.System.SystemAdminPanel;

/**
 *
 * @author Raushan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem ecosystem;
    UserAccount userAccount;
    Network network;
    Enterprise enterprise;
    Organization organization;
    public MainJFrame() {
        initComponents();
        ecosystem = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(ecosystem);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnRegisterDoner = new javax.swing.JButton();
        txtUserPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        txtUserName.setText("sysadmin");
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnRegisterDoner.setText("Donor Registration");
        btnRegisterDoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDonerActionPerformed(evt);
            }
        });

        txtUserPassword.setText("sysadmin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1)
                            .addComponent(btnLogout))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegisterDoner)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnRegisterDoner)
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(btnLogout)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel3.setFont(new java.awt.Font("PT Serif", 1, 36)); // NOI18N
        jLabel3.setText("Donation Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel3)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addContainerGap(630, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        String userPassword = new String(txtUserPassword.getPassword());

        userAccount = ecosystem.getuserAccountList().authenticateUser(userName, userPassword);
        network = null;
        enterprise = null;
        organization = null;

        if (userAccount == null) {
            for (Network n : ecosystem.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEntList()) {
                    userAccount = e.getuserAccountList().authenticateUser(userName, userPassword);
                    network = n;
                    if (userAccount == null) {
                        for (Organization org : e.getOrgDirectory().getOrgList()) {
                            userAccount = org.getuserAccountList().authenticateUser(userName, userPassword);
                            if (userAccount != null) {
                                network = n;
                                enterprise = e;
                                organization = org;
                                break;
                            }
                        }

                    } else {
                        enterprise = e;
                        break;
                    }
                    if (organization != null) {
                        break;
                    }
                }
                if (enterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Credentials");
            return;
        } else {
            txtUserName.setEnabled(false);
            txtUserPassword.setEnabled(false);
            btnLogout.setEnabled(true);
            jButton1.setEnabled(false);
            btnRegisterDoner.setEnabled(false);
            jPanel2.setVisible(true);
            txtUserName.setText("");
            txtUserPassword.setText("");
            changePanel();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        txtUserName.setEnabled(true);
        txtUserPassword.setEnabled(true);
        btnRegisterDoner.setEnabled(true);
        jButton1.setEnabled(true);
        btnLogout.setEnabled(false);
        btnLogout.setText("Logout");
        dB4OUtil.storeSystem(ecosystem);

        txtUserName.setText("");
        txtUserPassword.setText("");

        jSplitPane1.setRightComponent(jPanel2);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisterDonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDonerActionPerformed
        // TODO add your handling code here:
        RegistrationDonorJPanel panel = new RegistrationDonorJPanel(jPanel2, ecosystem);
        jSplitPane1.setRightComponent(panel);
        txtUserName.setEnabled(false);
        txtUserPassword.setEnabled(false);
        btnLogout.setEnabled(true);
        jButton1.setEnabled(false);
        btnRegisterDoner.setEnabled(false);
        jPanel2.setVisible(true);
        txtUserName.setText("");
        txtUserPassword.setText("");
    }//GEN-LAST:event_btnRegisterDonerActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegisterDoner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables

    private void changePanel() {

        if (userAccount != null && userAccount.getRole() != null) {
            if (userAccount.getRole() instanceof SystemAdminRole) {
                SystemAdminPanel panel = new SystemAdminPanel(jPanel2, ecosystem);
                jSplitPane1.setRightComponent(panel);
            } 
            else if(userAccount.getRole() instanceof DonationAdminRole) {
                DonationAdminJPanel panel = new DonationAdminJPanel(ecosystem, network, enterprise, jPanel2);
                jSplitPane1.setRightComponent(panel);
            } 
            else if(userAccount.getRole() instanceof FundsAdminRole) {
                FundsAdminJPanel panel = new FundsAdminJPanel(ecosystem, network, enterprise,jPanel2, userAccount);
                jSplitPane1.setRightComponent(panel);
            } 
            else if(userAccount.getRole() instanceof KitSupplyAdmin) {
                KitSupplyAdminJPanel panel = new KitSupplyAdminJPanel(ecosystem, network, enterprise,jPanel2, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof DonorAdminRole) {
                DonorAdminJPanel panel = new DonorAdminJPanel(ecosystem, network, enterprise,jPanel2, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof DonorRole) {
                DonorJPanel panel = new DonorJPanel(ecosystem, network, enterprise,jPanel2, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
            
        }

    }
}