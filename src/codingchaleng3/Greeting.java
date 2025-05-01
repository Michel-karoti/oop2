package codingchaleng3;

public class Greeting { // Class name should match file name (capitalize first letter)
    public static void main(String[] args) {
        int time = 22;

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
