import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
                char[] chars = {'A', 'S', 'W', 'n', 'b'};

        System.out.println(Methods.square(12));
        System.out.println(Methods.square(70));
        System.out.println(Methods.square(3));
        System.out.println(Methods.printFullName("Macksim", " Zhirov"));
        String[] text = new String[]{"Word", "Word Java", "Word Java World", "W"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(text)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(arr)));
        System.out.println(Methods.cornerValuesArray(chars));
    }
}
