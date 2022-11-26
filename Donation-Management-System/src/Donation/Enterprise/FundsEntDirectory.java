/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Enterprise;

import Donation.Role.FundsAdminRole;
import Donation.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class FundsEntDirectory extends Enterprise{
    
    public FundsEntDirectory(String name) {
        super(name, Enterprise.EntType.FundsEntDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FundsAdminRole());
        return roles;
    }
    
}
