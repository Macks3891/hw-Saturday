import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Methods.square(12));
        System.out.println(Methods.square(70));
        System.out.println(Methods.square(3));
        System.out.println(Methods.printFullmame("Macksim", " Zhirov"));
        String[] text = new String[]{"Word", "Word Java", "Word Java World", "W"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(text)));
    }
}
