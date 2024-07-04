public class forloop {
    public static void main(String[] args) {
      /* int n=4;
       for(int i=n; i>0 ; i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }*/
        // *********************************************************//
       /* int sum= 0;
        int n = 3;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
            System.out.println("sum of even number is:");
            System.out.println(sum);*/
        // **********************************************************//

     /*   int n = 7;
        int i = 0;
        while(i<10){
            System.out.printf("%d * %d=%d \n",n,i,n*i);
             i++;
        }
    */
        /*int n = 7;
        int i = 0;
        for (i = 10; i>0; i--) {
            System.out.printf("%d*%d=%d\n", n, i, n * i);
        }*/
      /*  int n = 5;
        int i = 1;
        int factorial=1;
        while (i <=n) {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);*/
       /* int n = 5;
        int factorial = 1;
        for (int i = 1; i<=n; i++) {
            factorial *=i;
        }
        System.out.println(factorial);*/
        int n = 8;
        int i = 1;
        int sum = 0;
        for (i=1;i<3;i++){
            sum +=n*i;
        }
        System.out.println(sum);
    }
}

