package SRP;

public class ReportGenerator {

    public void generateReport(Customer customer, String reportType) {
        System.out.println("Generating the Report.....");

        if (reportType.equalsIgnoreCase("CSV")) {
            System.out.println("CSV report");
        }
        if (reportType.equalsIgnoreCase("XML")) {
            System.out.println("XML report");
        }

    }
}