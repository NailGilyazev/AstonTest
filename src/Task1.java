import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstArgument = sc.nextInt();
        int secondArgument = sc.nextInt();
        sc.close();

        System.out.println(compareArguments(firstArgument, secondArgument));

        System.out.println(sum(firstArgument, secondArgument));
        System.out.println(subtraction(firstArgument, secondArgument));
        System.out.println(division(firstArgument, secondArgument));
        System.out.println(multiply(firstArgument, secondArgument));

    }

    private static String sum(int firstArgument, int secondArgument) {
        return ("сумма аргументов: " + (firstArgument + secondArgument));
    }

    private static String subtraction(int firstArgument, int secondArgument) {
        return ("Разность аргументов: " + (firstArgument - secondArgument));
    }

    private static String division(int firstArgument, int secondArgument) {
        return ("Частное аргументов: " + ((double)firstArgument / (double)secondArgument));
    }

    private static String multiply(int firstArgument, int secondArgument) {
        return ("Произведение аргументов: " + (firstArgument * secondArgument));
    }

    private static String compareArguments(int firstArgument, int secondArgument) {
        if (firstArgument < secondArgument) {
            return "a < b";
        } else if (firstArgument > secondArgument) {
            return "a > b";
        } else {
            return "a = b";
        }
    }
}
