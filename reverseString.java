import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        String orgStr;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");

        orgStr= sc.nextLine();
        String reversedStr = "";
        for (int i = 0; i < orgStr.length(); i++)
            reversedStr = orgStr.charAt(i) + reversedStr;
        System.out.println("Reversed string : " + reversedStr);
    }
}