/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Donation.Employee.Employee;
import Donation.Role.SystemAdminRole;
import Donation.UserAccount.UserAccount;

/**
 *
 * @author Raushan
 */
public class ConfigureSystem {
    
    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();

        Employee employee = ecosystem.getEmpDirectory().addEmployee("Raushan");
        employee.setId(1775832);
        
        UserAccount useracc = ecosystem.getuserAccountList().addUserAccount("sysadmin", "sysadmin", new SystemAdminRole(), employee);
        
        return ecosystem;
    }
    
}
