import java.util.Scanner;
public class currencyConverter {

    public static void convertinrtoaed() {

        float aed, inr;
        Scanner sc = new Scanner(System.in);
        System.out.println("write the amount in inr to convert in aed ");
        inr = sc.nextFloat();
        aed = (float) (0.044 * inr);
        System.out.println("your Rs " + inr + " is AED " + aed);
    }
      public static void convertaedtoinr() {
        float inr,aed;
        Scanner sc=new Scanner(System.in);
          System.out.println("write your amount in aed to convert in inr ");
          aed = sc.nextFloat();
          inr = (float) (22.70 * aed);
          System.out.println("your AED " + aed + " is inr " + inr);
      }
      public static void convertinrtodollar(){
        float inr,dollar;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your amount in inr to convert in dollar ");
        inr=sc.nextFloat();
        dollar=(float)(0.012 * inr);
        System.out.println("your Rs "+ inr + " is Dollar "+ dollar);

    }

    public static void main(String[] args) {
       //aed();

 convertinrtoaed();
        convertaedtoinr();
 convertinrtodollar();
    }
}
