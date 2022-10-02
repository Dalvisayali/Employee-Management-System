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
    private long id;

    public EmployeeData() {
        this.employeeList = new ArrayList<>();
    }
    
    public EmployeeData(long id) {
        this.employeeList = new ArrayList<>();
        initialiseList(id);
        
    }
    

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Employee addNewEmployee(Employee employee){
        employeeList.add(employee);
        return employee;
    }

    @Override
    public String toString() {
        return "EmployeeData{" + "employeeList=" + employeeList + ", id=" + id + '}';
    }

 
    
    private void initialiseList(long id){
        Employee employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Sayali Dalvi");
        employee.setAge(Integer.parseInt("25"));
        employee.setGender("F");
        employee.setStartDate("20 Oct, 2019");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        this.id = id;
        
    }
    
}
