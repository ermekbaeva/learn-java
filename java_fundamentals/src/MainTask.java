import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayHi(name);
        textReverse(name);
        randomNumbers(7);

    }
    static void sayHi(String name){
        System.out.println("Hi, "+ name + "!");
    }
    static void textReverse(String text){
        StringBuilder rev = new StringBuilder(text);
        System.out.println(rev.reverse());
    }
    static void randomNumbers(int count){
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
    }

}
