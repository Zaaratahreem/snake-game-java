import java.util.Scanner;
public class human  {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age here: ");
        int age=sc.nextInt();
        if (age>10 & age<18){
            System.out.println("hello pretty teenager!! ");
        }
        else if(age>18 & age<25){
            System.out.println("hello young lady/Man!!");
        }
        else
            System.out.println("hello beautiful Lady / Gentleman!!");
    }
}
