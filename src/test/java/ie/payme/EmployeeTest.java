package ie.payme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class EmployeeTest  {

    private static Scanner scanner = new Scanner(System.in);
    private static EmpList empList = new EmpList("Employee Payment system");
    private Employee emp;

    @BeforeEach
     private void addEmployee() {
        System.out.println("Enter new employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Create new employee's id number: ");
        String id = scanner.nextLine();
        Employee newEmployee = Employee.createEmp(name, id);
        if (empList.addEmployee(newEmployee)) {
            System.out.println("New employee added to the system: Enter name = " + name + ", Enter id = " + id);
        } else {
            System.out.println("Cannot add id number " + id + " is already in the system.");
        }
    }



    @Test
    public void employeeTest(){
        System.out.println("Enter new employee's name: ");
        String name = scanner.nextLine();
        System.out.println("Create new employee's id number: ");
        String id = scanner.nextLine();
        Employee newEmployee = Employee.createEmp(name, id);
        if (empList.addEmployee(newEmployee)) {
            System.out.println("New employee added to the system: Enter name = " + name + ", Enter id = " + id);
        } else {
            System.out.println("Cannot add id number " + id + " is already in the system.");
        }

       /* boolean end = false;

        while (!end) {
            System.out.println("0 - to close\n" + "1 - to add employee\n" + "2 - to see current employees in the system" + "3 - to fire an employee.");
            int empAction = scanner.nextInt();
            scanner.nextLine();

            switch (empAction) {
                case 0:
                    System.out.println("\nEnding the payment system");
                    end = true;
                    break;
                case 1:
                    addEmployee();
                    break;
                default:
                    break;
            }
        }*/
    }
}
