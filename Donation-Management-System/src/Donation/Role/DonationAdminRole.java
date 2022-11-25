/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Role;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Raushan
 */
public class DonationAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise ent, Network network, EcoSystem ecosystem) {
        return null;
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.DonationAdmin.getValue());
    }
    
}
