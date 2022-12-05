/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
import Donation.Role.Role;
import Donation.Role.SystemAdminRole;
import Donation.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public Network createNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
        
    }
    
    public void deleteNetwork(String name) {
        for (Network net : networkList) {
 
            if (net.getName() == name) {
                networkList.remove(net);
                break;
            }
        }
    }
    public Network gettNetwork(String name) {
        for (Network net : networkList) {
 
            if (net.getName() == name) {
                networkList.remove(net);
                return net;
            }
        }
        return null;
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listRole = new ArrayList<Role>();
        listRole.add(new SystemAdminRole());
        return listRole;
    }


    public static void setInstance(EcoSystem system) {
        ecosystem = system;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
  
    public boolean checkIfUserIsUnique(String userName) {
        return checkUserUniqueness(userName, ecosystem);
    }

    public boolean checkUserUniqueness(String userName, EcoSystem ecoSys) {
        for (Network network : ecoSys.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEntList()) {
                for (UserAccount useracc : enterprise.getuserAccountList().getUaList()) {
                    if (useracc.getUsername().equals(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrgDirectory().getOrgList()) {
                    for (UserAccount useracc : organization.getuserAccountList().getUaList()) {
                        if (useracc.getUsername().equals(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

    public boolean isUnique(String name) {
        for (Network network : networkList) {
            if (network.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }
    
}
