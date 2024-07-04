class arraymarks{
    public static void main(String[] args){
        int [] marks = new int[5];
        marks[0]=100;
        marks[1]=30;
        marks[2]=29;
        marks[3]=87;
        marks[4]=99;
       /* for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);*/
        for(int element : marks){
            System.out.println(element);
        }

    }

}
