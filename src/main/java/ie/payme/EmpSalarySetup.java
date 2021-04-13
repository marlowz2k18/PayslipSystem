package ie.payme;

public class EmpSalarySetup {

    private double empPaid;
    private double emphours;
    private double empTax;
    private double empnetSalary;
    private double empgrossPay;

    public EmpSalarySetup( double empPaid, double emphours,double empTax, double empnetSalary,double empgrossPay ) {

        this.empPaid = empPaid;
        this.emphours = emphours;
        this.empTax = empTax;
        this.empnetSalary = empnetSalary;
        this.empgrossPay = empgrossPay;

    }
    public double getEmpgrossPay() { return empgrossPay; }

    public void setEmpgrossPay(double empgrossPay) { this.empgrossPay = empgrossPay; }

    public double getEmpnetSalary() { return empnetSalary; }

    public void setEmpnetSalary(double empnetSalary) { this.empnetSalary = empnetSalary; }

    public double getEmpTax() { return empTax; }

    public void setEmpTax(double empTax) { this.empTax = empTax; }

    public double getEmphours() {
        return emphours;
    }

    public void setEmphours(double emphours) {
        this.emphours = emphours;
    }

    public double getEmpPaid() { return empPaid;
    }

    public void setEmpPaid(double empPaid) {
        this.empPaid = empPaid;
    }

}
