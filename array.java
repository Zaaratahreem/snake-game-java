/*import java.util.Scanner;
public class array {
    public static void main(String[] args) {
       /* int size;
            Scanner sc= new Scanner(System.in);
        System.out.println("enter the array size");
        size=sc.nextInt();
            int a[]=new int[size];
            for(int i=0;i<size;i++){
              a[i]= sc.nextInt();
            }
        System.out.println("printed elements of array are: ");
            for(int i=0;i<size;i++){
                System.out.println(a[i] + "  "  );
            }
*/
       /* int a[] = new int[3];
        a[0] = 21;
        a[1] = 3;
        a[2] = 4;
        for (int b: a) ;
        {
            System.out.println(b + " ");
        }
    }
}
        /*int size,i,];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");

        //[]=new int[size];

        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printed array elements");
        for(i=0;i<size;i++){
            System.out.println(a[i]+ " " );
        }*/

       /* float[] marks={45.4f,56.8f,62.1f,89.54f,55.4f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the sum of the marks is"+sum);*/



        /*float[] marks= {4.2f,2.1f,4.9f,1.2f,6.9f,9.4f};
        float avrg=0;
        float sum=0;
        for (float element: marks) {
            sum = sum + element;

            System.out.println(sum);
            avrg = sum / 6;
            System.out.println("average marks of all student is " + avrg);*/



        /*int [] marks={22,45,89,12,87,30,99,74};
        int num=0;
        boolean isInArray= false;
        for(int element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if (isInArray){
                System.out.println("the number is present in an array");
            }
            else {
                System.out.println("the number is not present in an array");
            }*/


        /*int [] marks={22,89,76,54,12};
        int sum=0;
        int avrg=0;
        for (int element:marks){
            sum=sum+element;
            avrg=sum/5;
        }
        System.out.println("the avrg of marks is "+avrg);*/


        /*int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {  // this will work for row times
            for (int j = 0; j < mat2[i].length; j++) {  // this will work for columns times
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
            for (int i = 0; i < mat1.length; i++) {

                for (int j = 0; j < mat2[i].length; j++) {  // this will work for columns times
                    System.out.print( result[i][j]+ " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("\n");
            }*/


        /*int[] numbers = {1, 2, 3, 4, 5};
        int l = numbers.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i=0;i<n;i++){
            temp= numbers[i];
            numbers[i]=numbers[l-i-1];
            numbers[l-i-1]=temp;
        }
        for (int element:numbers){
            System.out.println(element+"\t");
        }

         */
        /*int[] arr = {1, 45, 22, 33, 88, 54, 9, 345, 2100};
        int max = 0;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
            System.out.println("the maximum number in array is " + max);
        }
    }*/







