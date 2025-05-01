public class Variables {
    double amount;
    double interest; // Percentage

    // Method to calculate interest over time
    void showInterest() {
        amount = 1200.00; // Initialize amount
        System.out.println("Amount: " + amount);

        interest = 3.0; // Fix typo in variable name
        amount = amount * (100 + interest) / 100; // Corrected interest calculation
        System.out.println("After a year: " + amount);

        amount = amount * (100 + interest) / 100; // Corrected calculation
        System.out.println("After 2 years: " + amount);
    }

    public static void main(String[] args) { // Corrected "string" to "String"
        (new Variables()).showInterest(); // Capitalized class name
    }
}
