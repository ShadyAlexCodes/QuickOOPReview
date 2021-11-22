package com.example.quickreview;

public class Employee {

    private int employeeId;
    private String employeeName;
    private float salary;

    private EmploymentStatus employmentStatus;


    public Employee() {

    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(int employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Employee(int employeeId, String employeeName, float salary, EmploymentStatus employmentStatus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.employmentStatus = employmentStatus;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void employeeWork() {
        System.out.println("The employee " + employeeName + " is currently working.");
    }

    public void employeeBreak() {
        System.out.println("The employee " + employeeName + " is currently on break.");
    }

    public void employeeLeave() {
        System.out.println("The employee " + employeeName + " is finally going home.");
    }

}
