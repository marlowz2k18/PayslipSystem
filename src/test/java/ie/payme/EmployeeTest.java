package ie.payme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {


    private Employee emp = new Employee("Marlowe", "12345");
    private EmpList empList = new EmpList("Employee payment system");
    private Salaries s1;

    @BeforeEach
    private void init() {
        String testing = "Testing for Employee payment system";
        System.out.println(testing);
        s1 = new Salaries(40.00, 1.00 );
    }

    @Test
    public void addEmpNameTest() {
        Assertions.assertEquals("Marlowe", emp.getEmpName());
    }

    @Test
    public void addEmpIDTest() {
        Assertions.assertEquals("001568", emp.getEmpId());
    }

    @Test
    public void addEmpolyeeTest() {

        boolean empListisTrue = this.empList.addEmployee(Employee.createEmp("Marlowe", "001568"));
        Assertions.assertTrue(empListisTrue);

    }

    @Test
    public void fireEmployeeTest() {
        boolean fireEmployeeTrue = this.empList.fireEmployee(empList.currentEmployees("001568"));
        Assertions.assertTrue(fireEmployeeTrue);
    }

    @Test
    public void currentEmployeeTest(){
        String currentEmployee = this.empList.currentEmployees(empList.currentEmployees("001568"));
        Assertions.assertEquals("001568",currentEmployee);
    }




    /*@Test
    void TestbasicHFail() throws IOException {
        EmpSalarySetup empSalarySetup = new EmpSalarySetup();
        assertEquals(0, empSalarySetup.getEmphours);

    }


    @Test
    void TestoverTimePay()
    {
        // mySalaries = new Salaries();
        assertEquals(41, s1.overTimePay();
    }
    @Test
    void TestcalcTax()
    {
        //  mySalaries = new Salaries();
        assertEquals(1200, mySalaries.calcTax());
    }

    @Test
    void TestnettSalary()
    {
        // mySalaries = new Salaries();
        assertEquals(1200, mySalaries.nettSalary());
    }

    @Test
    void TestgrossSalary()
    {
        //   mySalaries = new Salaries();
        assertEquals(1300, mySalaries.grossSalary());
    }*/


}
