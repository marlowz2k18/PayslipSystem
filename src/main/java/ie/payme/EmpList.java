package ie.payme;

import java.util.ArrayList;

public class EmpList {
    private String empPay;
    private ArrayList<Employee> myEmployees;

    public EmpList(String empPay) {
        this.empPay = empPay;
        this.myEmployees = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee) {
        if(findEmp(employee.getEmpName()) >=0) {
            throw new IllegalArgumentException("Employee is already in the system");
        }
        myEmployees.add(employee);
        return true;
    }

    public int findEmp(Employee employee){
        return this.myEmployees.indexOf(employee);
    }

    public int findEmp(String employeeName){
        for(int i=0; i<this.myEmployees.size(); i++){
            Employee employee = this.myEmployees.get(i);
            if(employee.getEmpName().equals(employeeName)){
                return i;
            }
        }
        return -1;
    }

    public boolean fireEmployee(Employee employee){
        int foundEmpPost = findEmp(employee);
        if(foundEmpPost < 0){
            throw new IllegalArgumentException(employee.getEmpName() + ", can't find employee name.");
        }
        this.myEmployees.remove(foundEmpPost);
        System.out.println(employee.getEmpName() + ", was fired.");
        return true;
    }
}
