import java.util.Scanner;
public class switchcase2{
    public static void main(String[]args){
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        age= sc.nextInt();
        switch (age){
            case 18:
                System.out.println("adult stage");
                break;
            case 28:
                System.out.println("jobb stage");
                break;
            case 60:
                System.out.println("retiring stage");
                break;
            default:
                System.out.println("you have enjoying stage");
        }

    }
}

