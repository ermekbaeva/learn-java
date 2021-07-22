package OptionalTaskOne;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalOneLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");
        System.out.println(Arrays.toString(array));
        shortNumber(array);
    }

    static void shortNumber(String[] array) {
        int max = array[0].length();
        int min = array[0].length();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
            }
            if (array[i].length() < min) {
                min = array[i].length();
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }


}



