/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Donation.Enterprise.Enterprise;
import Donation.Network.Network;
import Donation.Organization.Organization;
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
        super();
        networkList = new ArrayList<>();
    }

    public Network createNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
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
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount useracc : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (useracc.getUsername().equals(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount useracc : organization.getUserAccountDirectory().getUserAccountList()) {
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
