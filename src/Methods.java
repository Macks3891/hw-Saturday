/**
 * Класс Methods содержит статические методы для выполнения различных операций.
 */
public class Methods {
    private static String min;
    private static String max;

    /**
     * Вычисляет квадрат переданного целого числа
     * number целое число, квадрат которого нужно вычислить
     * квадрат переданного числа
     */
    public static int square(int number) {
        return (int) Math.pow(number, 2);
    }

    /**
     * Возвращает полное имя, объединяя имя и фамилию.
     * name имя
     * lastName фамилия
     * полное имя в формате "Имя Фамилия"
     */
    public static String printFullName(String name, String lastName) {
        return name + " " + lastName;
    }

    /**
     * Находит самую короткую и самую длинную строку из переданных строк.
     *  arr переменное количество строк
     *  массив из двух строк: самая короткая и самая длинная строка
     */
    public static String[] cornerValuesArray (String... arr) {
        String min = arr[0];
        String max = arr[0];
        int minn = arr[0].length();
        int maxx = arr[0].length();
        for (int i = 1; i < arr.length; i++){
            if (minn > arr[i].length()) {
                minn = arr[i].length();
                min = arr[i];
            }
            else if (maxx < arr[i].length()) {
                maxx = arr[i].length();
                max = arr[i];
            }
        }

        return new String[] {min, max};
    }
    /**
     * Находит минимальное и максимальное число из переданных целых чисел.
     * arr переменное количество целых чисел
     * массив из двух чисел: минимальное и максимальное число
     */
    public static int[] cornerValuesArray(int... arr) {
        if (arr.length == 0) {
            return new int[] {0, 0};
        }
        int min = arr[0];
        int max = arr[0];

        for (int num = 1; num < arr.length; num++) {
            if (arr[num] < min) {
                min = arr[num];
            }
            if (arr[num] > max) {
                max = arr[num];
            }
        }
        return new int[]{min, max};
    }
    /**
     * Находит минимальный и максимальный символ из переданных символов.
     * arr переменное количество символов
     * массив из двух символов: минимальный и максимальный символ
     */
    public static char[] cornerValuesArray(char... arr) {
        if (arr.length == 0) {
            return new char[] {0, 0};
        }
        char min = arr[0];
        char max = arr[0];

        for (char i =1; i < arr.length; i++) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new char[] {min, max};
    }
}
