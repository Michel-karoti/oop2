package oop_excercise;

public class CreateAccount
{
    public static void main(String[] args)
    {
        Account michelAccount = new Account(); // creating an object
        michelAccount.accountNo = 191883; // account number should be an integer
        michelAccount.accountName = "Michel"; // use double quotes for strings
        michelAccount.balance = 600;

        System.out.println("A/c no: " + michelAccount.accountNo +
                "\nA/c name: " + michelAccount.accountName +
                "\nBalance: " + michelAccount.balance);
    }
}

