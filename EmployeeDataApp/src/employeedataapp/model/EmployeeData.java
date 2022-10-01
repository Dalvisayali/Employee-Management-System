/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedataapp.model;

import java.util.ArrayList;

/**
 *
 * @author Sayali Dalvi
 */
public class EmployeeData {
    private ArrayList<Employee> employeeList;

    public EmployeeData() {
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee addNewEmployee(Employee employee){
        employeeList.add(employee);
        return employee;
    }
    
}
