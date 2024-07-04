import java.util.Scanner;
public class calculator {
    public static void addition() {
        Scanner sc = new Scanner(System.in);
        //int a=0;
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("add answer is " + sum);
    }

    public static void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int subs = a - b;
        System.out.println("sub answer is " + subs);
    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("mul answer is " + mul);
    }
    public static void division(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int div = a/b;
        System.out.println("div answer is = "+div);
    }


    public static void main(String[] args) {
        int option=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter option");
        System.out.println("enter 1 for add");
        System.out.println("enter 2 for sub");
        System.out.println("enter 3 for mul");
        System.out.println("enter 4 for div");
        System.out.println("enter your option");
         option = sc.nextInt();
        switch (option){
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }


}