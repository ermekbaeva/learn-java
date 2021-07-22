import java.util.Arrays;
import java.util.Random;

public class MainRandomNumbers {
    public static void main(String[] args) {
        randomNumbers(7);
    }

    static void randomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
