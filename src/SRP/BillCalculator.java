package SRP;

public class BillCalculator {

    public int calculateBill(Customer customer, int tax) {
        int bill = 1000;
        System.out.println("Calculating the Bill.....");
        bill += tax;
        customer.setBill(bill);
        return bill;
    }
}