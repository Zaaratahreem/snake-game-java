public class arraymatrix {
    public static void main(String[]args){
        int [][] flats;
        flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println("printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){// this will work for i=1 ie for 2nd floor or you say 201,202,203.
            for (int j=0; j<flats[i].length;j++){ // this J- Loop is working for first floor or you say its working for 101,102,103.
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }

    }
}
