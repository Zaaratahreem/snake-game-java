import java.util.Scanner;
public class recursionpractice {
  public static void printSum(){
  int a,b,sum=0;
  Scanner sc=new Scanner(System.in);
      System.out.println("enter a");
  a= sc.nextInt();
      System.out.println("enter b");
  b= sc.nextInt();
  sum=a+b;
      System.out.println("your answer is");
      System.out.println(sum);

  }

    public static void main(String[] args) {
      printSum();
        //System.out.println("your answer is : ");
       // printSum();
    }
}





/*static void pattern(int n){
    n=4;
    for(int i=n;i>0;i--){
        for (int j=0;j<i;j++){
            System.out.println("*");
        }
        System.out.println("\n");
    }
}
public static void main(String []args){
    pattern(5);
}

    /************************************************
    static int fib(int n){
if (n==1) {
    return 0;
}
else if(n==2){
    return 1;
}
else
    return fib(n-1)+fib(n-2);
}
public static void main(String[]args){
    int result=fib(5);
    System.out.println(result);
}*/
   /* static int average(int...arr){
        for(int num:average(3,4,3,2))
        return (sum)/arr.length;
    }
    public static void main(String []args)
    {
        System.out.println("the average of number is:"+average(4,7,9,3,2,5));
    }

}*/
