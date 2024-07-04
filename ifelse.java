import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int year;
        System.out.println("enter the year");
        year=Sc.nextInt();
        if (year % 4==0 ){
            System.out.println("its a leap year");
        } else if (year % 100 ==0 && year % 400 == 0) {
            System.out.println("yes leap year");
        }
        else {
            System.out.println("its not a leap year");
        }
    }
}
