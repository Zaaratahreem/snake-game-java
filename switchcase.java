import java.util.Random;
import java.util.Scanner;;
public class switchcase {
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int number;
        System.out.println("enter your number");
        number= Sc.nextInt();
        Random rand= new Random();
        int upperbound=3;
        System.out.println("computer turn"+ upperbound);
        switch (number) {
            case 1:
                System.out.println("ROCK");
                break;
            case 2:
                System.out.println("PAPER");
                break;
            case 3:
                System.out.println("SCICSOR");
                break;
        }
    }
}
