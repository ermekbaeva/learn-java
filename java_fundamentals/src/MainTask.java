import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        sayHi(name);
        textReverse(name);
    }

    static void sayHi(String name) {
        System.out.println("Hi, " + name + "!");
    }

    static void textReverse(String text) {
        StringBuilder rev = new StringBuilder(text);
        System.out.println(rev.reverse());
    }


}
