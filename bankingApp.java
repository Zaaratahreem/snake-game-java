
import java.util.Scanner;
public class bankingApp {
    static double balance = 0; //initialise the balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;//initialise th option

        while (true) {
            System.out.println("welcome to the bank ");
            System.out.println("1. check account balance ");
            System.out.println("2.deposit money");
            System.out.println("3.withdraw money");
            System.out.println("4.Exit");
            System.out.println("Enter an option: ");
            option = sc.nextInt();// taking option input from user
            switch (option) {
                case 1:
                    checkBalance();
                     break;
                case 2:
                    deposit();
                     break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    Exit();
                    break;
                default:
                    System.out.println("invalid option! try again");
                    break;
            }
        }
    }

    public static void checkBalance() {
        double balance = 0;
        System.out.println("your account balance is $" + balance);

    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        double amount = sc.nextDouble();
        System.out.println("$" + amount + "has been deposited");
        balance = balance + amount;
        System.out.println("now your account balance is $" + balance);

    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("insufficient fund in your account!!");
        } else {
            System.out.println("$" + amount + "has been withdrawn from your account");
            balance = balance - amount;
            System.out.println("you are left with $" + balance);
        }

    }

    public static void Exit() {

        System.out.println("Thank you for banking with us! hope we have another transaction soon!");
    }
}
