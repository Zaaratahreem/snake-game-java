import java.util.ArrayList;
import java.util.Scanner;

public class addressBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name");
        String name = scanner.next();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        names.add("Aaron");
        numbers.add("0845 50 50 50");
        names.add("Fred");
        numbers.add("00 49 12345");
        names.add("Jonas");
        numbers.add("666");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                System.out.println("Number: " + numbers.get(i));
            }
        }
    }
}