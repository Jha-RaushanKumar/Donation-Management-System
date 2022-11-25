/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> entList;

    public EnterpriseDirectory() {
        entList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEntList() {
        return entList;
    }

    public void setEntList(ArrayList<Enterprise> entList) {
        this.entList = entList;
    }
    
    public Enterprise addEnterprise(String entName, Enterprise.EnterpriseType type) {
        Enterprise ent = null;
        if (type == Enterprise.EnterpriseType.DonationDirectory) {
            ent = new DonationDirectory(entName);
            entList.add(ent);
        } else if (type == Enterprise.EnterpriseType.FundsDirectory) {
            ent = new FundsDirectory(entName);
            entList.add(ent);
        } else if (type == Enterprise.EnterpriseType.KitSupplyDirectory) {
            ent = new KitSupplyDirectory(entName);
            entList.add(ent);
        } else if (type == Enterprise.EnterpriseType.DonorDirectory) {
            ent = new DonorDirectory(entName);
            entList.add(ent);
        }
        return ent;
    }
    
}
