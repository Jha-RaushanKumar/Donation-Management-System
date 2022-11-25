/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.UserAccount;

import Configuration.EcoSystem;
import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> uaList;

    public UserAccountDirectory(ArrayList<UserAccount> uaList) {
        this.uaList = uaList;
    }

    public ArrayList<UserAccount> getUaList() {
        return uaList;
    }

    public void setUaList(ArrayList<UserAccount> uaList) {
        this.uaList = uaList;
    }

    public UserAccount addUserAccount(String username, String password, Role role) {
        UserAccount uAccount = new UserAccount();
        uAccount.setUsername(username);
        uAccount.setPassword(password);
        uAccount.setRole(role);
        uaList.add(uAccount);
        return uAccount;
    }
    
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount useracc : uaList) {
            if (useracc.getUsername().equals(username) && useracc.getPassword().equals(password)) {
                return useracc;
            }
        }
        return null;
    }
    
    public boolean checkUserNameUniqueness(String username) {
        for (UserAccount useracc : uaList) {
            if (useracc.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
