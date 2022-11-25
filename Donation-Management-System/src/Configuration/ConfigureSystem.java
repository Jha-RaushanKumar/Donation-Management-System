/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Donation.Employee.Employee;
import Donation.UserAccount.UserAccount;

/**
 *
 * @author Raushan
 */
public class ConfigureSystem {
    
    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();

        Employee employee = ecosystem.getEmployeeDirectory().createEmployee();
        employee.setId(1775832);
        employee.setName("Raushan");

        UserAccount useracc = ecosystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        useracc.setUsername("sysadmin");
        useracc.setPassword("sysadmin");
        useracc.setEmployee(employee);
        useracc.setRole(new SystemAdminRole());
        
        return ecosystem;
    }
    
}
