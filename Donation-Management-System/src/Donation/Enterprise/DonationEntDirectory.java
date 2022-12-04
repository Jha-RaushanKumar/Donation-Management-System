/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Enterprise;

import Donation.Role.DisasterReliefOrgAdminRole;
import Donation.Role.DonationAdminRole;
import Donation.Role.EducationDonationOrgAdminRole;
import Donation.Role.Role;
import Donation.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class DonationEntDirectory extends Enterprise{
    
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public DonationEntDirectory(String name) {
        super(name, Enterprise.EntType.DonationEntDirectory);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new DonationAdminRole());
        roles.add(new DisasterReliefOrgAdminRole());
        roles.add(new EducationDonationOrgAdminRole());
        return roles;
    }
    
}
