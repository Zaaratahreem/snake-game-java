public class methodpractice {
    /*{  static void multiplication(int n){
          for(int i=0;i<=10;i++){
              System.out.format("%d*%d=%d\t",n,i,n*i);
          }
      }
      public static void main(String []args){
          multiplication(7);
      }
   // ***************************************************************/
    static void star(int n) {
        n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        star(5);
    }
}

