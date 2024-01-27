
public class Task3 {
    public static void main(String[] args) {
        int massive[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenMassive = evenNumbers(massive);
        System.out.println(massiveToString(evenMassive));


    }

    private static int[] evenNumbers(int[] massive) {
        int massiveLength = 0;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i]%2==0){
            massiveLength++;
        }}
        int result[] = new int[massiveLength];
        int position = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2==0){
                result[position++] = massive[i];
            }
        }
        return result;
    }

    private static String massiveToString (int [] massive){
        String result = "";
        for (int i = 0; i < massive.length; i++) {
            result+=massive[i];
            result+=" ";
        }
        return  result;
    }

}
