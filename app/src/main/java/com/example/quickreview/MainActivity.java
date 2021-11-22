package com.example.quickreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee employeeOne = new Employee();

        employeeOne.setEmployeeId(1);
        employeeOne.setEmployeeName("Jon");
        employeeOne.setSalary(50000f);
        employeeOne.employeeWork();

        Employee employeeTwo = new Employee(2, "Jac", 300f);
        employeeTwo.employeeBreak();

        Employee employeeThree = new Employee(3);
        employeeThree.employeeLeave();

        Employee employeeFour = new Employee(4, "gymmie", 420f, EmploymentStatus.FIRED);
    }
}