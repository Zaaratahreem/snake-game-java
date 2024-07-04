import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your payment");
        float income=Sc.nextFloat();
        float tax=0;

        if (income < 2.5)
            tax =  0;

        else if (income >2.5 && income<5.0) {
            tax = tax + 0.05f * (income - 2.5f);
        }

         else if (income >5.0 && income>10.0) {
            tax = tax + 0.2f * (income - 2.5f);
        }
         else if (income > 10.0f) {
             tax = tax + 0.05f*(income-2.5f);
             tax = tax + 0.2f*(income-2.5f);
             tax = tax + 0.3f*(income-2.5f);

        }
        System.out.println("your tax tp be paid is "+ tax);
    }
}
       /* byte m1,m2,m3;
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1=Sc.nextByte();
        System.out.println("enter your marks in chemistry");
        m2=Sc.nextByte();
        System.out.println("enter your marks in maths");
        m3=Sc.nextByte();
        float avg= (m1+m2+m3)/3.0f;
        System.out.println("overall marks is "+avg);
        if (avg>=40 && m1>33 && m3>=33){
            System.out.println("congrats you have been promoted");
        }
        else {
            System.out.println("you have been not promoted");
        }

    }
}*/
