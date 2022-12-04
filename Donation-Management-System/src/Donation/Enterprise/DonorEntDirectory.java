/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Enterprise;

import Donation.Role.DonorAdminRole;
import Donation.Role.DonorRole;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class DonorEntDirectory extends Enterprise{
    
    public DonorEntDirectory(String name) {
        super(name, Enterprise.EntType.DonorEntDirectory);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new DonorRole());
        roles.add(new DonorAdminRole());
        return roles;
    }
    
}
