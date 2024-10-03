import java.util.Scanner;

public class Methods {
    static int square(int number) {
        return (int) Math.pow(number, 2);
    }

    static String printFullmame(String name, String lastName) {
        return name + " " + lastName;
    }

    static String[] cornerValuesArray(String[] arr) {
        String shortWord = arr[0];
        String longWord = arr[0];
        for (String element : arr) {
            if (element.length() < shortWord.length()) {
                shortWord = element;
            }
            if (element.length() > longWord.length()) {
                longWord = element;
            }
        }
        return new String[]{shortWord, longWord};
    }
}
