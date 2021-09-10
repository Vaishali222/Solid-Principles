package SRP;

public class Main {
    public static void main(String args[]) {
        Customer C = new Customer("Vaishali", 24);
        C.getName();
        C.getAge();

        BillCalculator B = new BillCalculator();
        B.calculateBill(C, 500);
        C.getBill();

        ReportGenerator R = new ReportGenerator();
        R.generateReport(C, "CSV");

    }
}
