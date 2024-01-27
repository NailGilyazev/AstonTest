import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.next();
        String secondString = sc.next();
        sc.close();

        System.out.println(stringCompare(firstString, secondString));

    }

    private static String stringCompare(String firstString, String secondString) {
        if(firstString.equals(secondString)){
            return "Строки идентичны";
        }else{
            return "Строки неидентичны";
        }
    }
}
