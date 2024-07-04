import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
     /*   Scanner myObj = new Scanner(System.in);
        System.out.println("enter num 1");
        int num_1= myObj.nextInt();
        System.out.println("enter num 2");
        int num_2= myObj.nextInt();
        int sum= num_2+num_1;
        System.out.println("answer ="+sum);
    }*/
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number u wish to see the table of ");
        num = sc.nextInt();
        System.out.println("the mul of "+ num+ " is ");
        for (i = 1; i < 11; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
