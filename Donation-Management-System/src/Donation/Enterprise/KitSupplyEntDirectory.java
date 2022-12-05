/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Enterprise;

import Donation.Role.DisasterReliefKitSupplyManagerRole;
import Donation.Role.EducationKitSupplyManagerRole;
import Donation.Role.KitSupplyAdmin;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class KitSupplyEntDirectory extends Enterprise{
    
    public KitSupplyEntDirectory(String name) {
        super(name, Enterprise.EntType.KitSupplyEntDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new KitSupplyAdmin());
        roles.add(new DisasterReliefKitSupplyManagerRole());
        roles.add(new EducationKitSupplyManagerRole());
        return roles;
    }
    
}
