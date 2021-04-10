package ie.payme;

import java.util.ArrayList;

public class EmpList {
    private String empSystem;
    private ArrayList<Employee> myEmployees;

    public EmpList(String empSystem) {
        this.empSystem = empSystem;
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

    public String currentEmployees(Employee employee){
        if(findEmp(employee) >= 0) {
            return employee.getEmpId();
        }
        else {
            throw new IllegalArgumentException(employee.getEmpId() + ", there is no employee id number in the system.");
        }
    }

    public Employee currentEmployees(String id){
        int empPost = findEmp(id);
        if(empPost >= 0){
            return this.myEmployees.get(empPost);
        }

        return null;
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

    public void employeePrint(){
        System.out.println("Employee list");
        for(int i=0; i<this.myEmployees.size(); i++){
            System.out.println((i+1) + "." +
                this.myEmployees.get(i).getEmpName() + "-->" +
                this.myEmployees.get(i).getEmpId());
        }
    }
}
