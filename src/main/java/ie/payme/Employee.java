package ie.payme;

public class Employee {

    private String empName;
    private String empId;


    public Employee(String empName, String empId) {
        this.empName = empName;
        this.empId = empId;

    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public static Employee createEmp(String name, String empId){
        return new Employee(name, empId);
    }
}
