package codingchalleng5;

import java.util.Scanner;

public class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    // Output "Hello" while the user wants to
    void showHello() {
        String choice; // Guard variable

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next(); // Set guard variable

        while ("h".equals(choice)) { // Check guard variable
            System.out.println("Hello");
            choice = sc.next(); // Update guard variable
        }

        sc.close(); // Close scanner to prevent resource leak
    }

    public static void main(String[] args) {
        HelloTillStop obj = new HelloTillStop();
        obj.showHello();
    }
}
