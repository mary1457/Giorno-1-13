
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int result = moltiplica(a, b);
        System.out.println(result);

        System.out.println(concatena("Mario", 30));

        String[] arr = inserisciInArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");

        System.out.println(Arrays.toString(arr));
    }
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String str, int num) {
        return str + num;
    }

    public static String[] inserisciInArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }
}