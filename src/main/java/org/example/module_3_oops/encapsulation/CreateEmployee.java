package org.example.module_3_oops.encapsulation;

public class CreateEmployee {
    public static void main(String[] args) {
        // Create object of Employee
        Employee emp = new Employee();
        emp.name = "John Doe";
//        emp.empId = 101;
        emp.setEmpId(201);
        emp.displayInfo();
//        emp.privateMethod(); we cannot call private method outside the class
    }
}
