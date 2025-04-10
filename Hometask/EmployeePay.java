public class EmployeePay {
    public static void main(String[] args) {
        double payAmount = 2000.00;      // Amount per pay period
        int payPeriods = 12;             // Number of pay periods in a year
        double annualPay = payAmount * payPeriods; // Total annual pay

        System.out.println("Total annual pay: $" + annualPay);
    }
}
