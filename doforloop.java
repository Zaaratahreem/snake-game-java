public class doforloop {
    public static void main(String[] args) {
       /* for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending loop");
                break;
            }
        }
    }
   }*/
       /* for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}
        */
        int i=0;
        do {
            i++;
            if (i== 2) {
                System.out.println("end loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }

    while(i<5);
        System.out.println("loop ends here");


    }
    }
