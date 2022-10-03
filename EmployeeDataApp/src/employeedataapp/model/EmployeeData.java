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
        employee.setStartDate("09/20/2017");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Tech Lead");
        employee.setEmailId("dalvi.sa@dell.com");
        employee.setPhone("7875640640");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Desai");
        employee.setAge(Integer.parseInt("35"));
        employee.setGender("M");
        employee.setStartDate("02/12/2019");
        employee.setLevel("L4");
        employee.setTeamInfo("Operations");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("desai.ro@dell.com");
        employee.setPhone("6684330126");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jagruti Agarwal");
        employee.setAge(Integer.parseInt("55"));
        employee.setGender("F");
        employee.setStartDate("05/12/2022");
        employee.setLevel("L2");
        employee.setTeamInfo("Analytics");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("agarwal.ja@dell.com");
        employee.setPhone("8731560437");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jay Mithani");
        employee.setAge(Integer.parseInt("41"));
        employee.setGender("M");
        employee.setStartDate("12/03/2016");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("mithani.ja@dell.com");
        employee.setPhone("9823156700");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Parshetty");
        employee.setAge(Integer.parseInt("33"));
        employee.setGender("M");
        employee.setStartDate("09/20/2021");
        employee.setLevel("L6");
        employee.setTeamInfo("Frontend Tech");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("parshetty.ro@dell.com");
        employee.setPhone("6543980125");
        
        this.employeeList.add(employee);
        
       
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Desai");
        employee.setAge(Integer.parseInt("35"));
        employee.setGender("M");
        employee.setStartDate("02/12/2019");
        employee.setLevel("L4");
        employee.setTeamInfo("Operations");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("desai.ro@dell.com");
        employee.setPhone("6684330126");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jagruti Agarwal");
        employee.setAge(Integer.parseInt("55"));
        employee.setGender("F");
        employee.setStartDate("05/12/2022");
        employee.setLevel("L2");
        employee.setTeamInfo("Analytics");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("agarwal.ja@dell.com");
        employee.setPhone("8731560437");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jay Mithani");
        employee.setAge(Integer.parseInt("41"));
        employee.setGender("M");
        employee.setStartDate("12/03/2016");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("mithani.ja@dell.com");
        employee.setPhone("9823156700");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Parshetty");
        employee.setAge(Integer.parseInt("33"));
        employee.setGender("M");
        employee.setStartDate("09/20/2021");
        employee.setLevel("L6");
        employee.setTeamInfo("Frontend Tech");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("parshetty.ro@dell.com");
        employee.setPhone("6543980125");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Desai");
        employee.setAge(Integer.parseInt("35"));
        employee.setGender("M");
        employee.setStartDate("02/12/2019");
        employee.setLevel("L4");
        employee.setTeamInfo("Operations");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("desai.ro@dell.com");
        employee.setPhone("6684330126");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jagruti Agarwal");
        employee.setAge(Integer.parseInt("55"));
        employee.setGender("F");
        employee.setStartDate("05/12/2022");
        employee.setLevel("L2");
        employee.setTeamInfo("Analytics");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("agarwal.ja@dell.com");
        employee.setPhone("8731560437");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Jay Mithani");
        employee.setAge(Integer.parseInt("41"));
        employee.setGender("M");
        employee.setStartDate("12/03/2016");
        employee.setLevel("L1");
        employee.setTeamInfo("Backend Tech");
        employee.setPositionTitle("Project Manager");
        employee.setEmailId("mithani.ja@dell.com");
        employee.setPhone("9823156700");
        
        this.employeeList.add(employee);
        
        employee = new Employee();
        employee.setEmployeeId(id++);
        employee.setName("Rohan Parshetty");
        employee.setAge(Integer.parseInt("33"));
        employee.setGender("M");
        employee.setStartDate("09/20/2021");
        employee.setLevel("L6");
        employee.setTeamInfo("Frontend Tech");
        employee.setPositionTitle("Associate Engineer");
        employee.setEmailId("parshetty.ro@dell.com");
        employee.setPhone("6543980125");
        
        this.employeeList.add(employee);
        
        
    }
    
}
