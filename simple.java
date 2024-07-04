import java.util.Scanner;
import java.util.*;
public class simple {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int p,r,t;
        System.out.println("enter the principle ");
        p=sc.nextInt();
        System.out.println("enter rate");
        r=sc.nextInt();
        System.out.println("enter the time");
        t=sc.nextInt();
        float simple = (float) (p * r * t)/100;
        System.out.println("your simple interest is "+simple);
    }
}