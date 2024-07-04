import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class budgetTracker {
    static float balance= 5500.65F;
    static float shopping_bill;
    static float grocery_bill;
    static float house_maintenance;
    static float academic_bills;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to java budget-tracker");
        while(true){
            System.out.println("1. check your balance");
            System.out.println("2. shopping bills");
            System.out.println("3. grocery bills");
            System.out.println("4. house maintenance");
            System.out.println("5. academic bills");
            System.out.println("6. savings");
            System.out.println("enter your choice");
            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("your total balance is $"+balance );
                    //break;
                case 2:

                    shoppingBill();

                case 3:
                    //.out.println("your grocery bills are :$");
                    groceryBills();

                case 4:
                   // System.out.println("your house maintenance cost your :$");
                    houseMaintenance();

                case 5:
                   // System.out.println("your academic bills are:$");
                    academicBills();

                case 6:
                   // System.out.println("your saving is $");
                    savings();

            }
    }
}
public static void shoppingBill(){
        Scanner sc =new Scanner(System.in);
    System.out.println("enter your shopping bill");
    shopping_bill=sc.nextFloat();
}
public static void groceryBills(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your grocery bills");
    grocery_bill=sc.nextFloat();
}
public static void houseMaintenance(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your house maintenance bill");
    house_maintenance =sc.nextFloat();
}
public static void academicBills(){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your academic bills");
    academic_bills=sc.nextFloat();
    }
    public static void savings(){
        float savings=  (balance-shopping_bill-grocery_bill-house_maintenance-academic_bills);
        System.out.println("your saving for this month is $"+savings);
    }
}