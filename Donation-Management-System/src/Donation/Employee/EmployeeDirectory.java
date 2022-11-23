/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donation.Employee;

import java.util.ArrayList;

/**
 *
 * @author Raushan
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;

    public EmployeeDirectory(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public void addEmployee(int id, String name) {
        Employee emp = new Employee(id, name);
        empList.add(emp);
    }
    
}
