package ie.payme;

public class Salaries {

    private double salary;
    private int hours;
    private double grossPay;
    private double tax;
    private double taxRate;
    private double overTime;
    private int hourlyRate;
    //   private double netSalary;
    private double basicHours;
    private double totOverHours;
    private String single;
    private String married;
    private double totalTax;
    private double rateM;
    //private double


    public Salaries(double v, double v1) {
        this.salary = salary;
        this.hours = hours;
        this.grossPay = grossPay;
        this.tax = tax;
        this.taxRate = taxRate;
        this.overTime = overTime;
        this.hourlyRate = hourlyRate;
        //    this.netSalary = netSalary;
        this.basicHours = basicHours;
        this.totOverHours = totOverHours;
        this.married = married;
        this.single = single;
        this.totalTax = totalTax;
        this.rateM = rateM;

    }

    public double basicH(EmpSalarySetup empay) {

        if (empay.getEmphours() == 40.00) {
            return empay.getEmphours() * empay.getEmpPaid();
        } else {
            throw new IllegalArgumentException(empay.getEmphours() + ", did not fully work time.");
        }


    }


    public double overTimePay(EmpSalarySetup empay) {
        double pay = basicH(empay);

        if (empay.getEmphours() > 40.00) {
            return empay.getEmphours() * (pay * 1.5);

        } else {
            throw new IllegalArgumentException(empay.getEmphours() + ", did not fully work overtime");
        }
    }

    public double calcTax(EmpSalarySetup empay) {
        double cpay = basicH(empay);


        if (empay.getEmpPaid() <= 1200) {
            return empay.getEmpPaid() * (cpay * 0.10);
        } else if (empay.getEmpPaid() > 1200 && empay.getEmpPaid() <= 2500) {
            return empay.getEmpPaid() * (cpay * 0.20);
        } else if (empay.getEmpPaid() > 2500 && empay.getEmpPaid() <= 5000) {
            return empay.getEmpPaid() * (cpay * 0.50);
        } else if (empay.getEmpPaid() > 5000) {
            return empay.getEmpPaid() * (cpay * 0.60);
        } else {
            throw new IllegalArgumentException(empay.getEmpPaid() + ", did not fully work Tax.");
        }
    }

    public double nettSalary(EmpSalarySetup empay) {
        double ctax = calcTax(empay);
        double grossP = grossSalary(empay);

        if (empay.getEmpnetSalary() == grossP - ctax) {

            return empay.getEmpnetSalary();
        } else {
            throw new IllegalArgumentException(empay.getEmpnetSalary() + ", nett Salary is not valid.");
        }
    }

    public double grossSalary(EmpSalarySetup empay) {
        double overT = overTimePay(empay);
        double bHour = basicH(empay);


        if (empay.getEmpgrossPay() == bHour + overT) {
            return empay.getEmpgrossPay();

        } else {
            throw new IllegalArgumentException(empay.getEmpgrossPay() + ", Gross Salary is not valid.");
        }
    }
}
