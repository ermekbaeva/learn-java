import java.util.Scanner;

public class MainTaskPartTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String data = scanner.nextLine();
        String[] array = data.split(" ");
        System.out.println(sumNumbers(array));

    }
    static int sumNumbers(String[] array){
        int[] num = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            num[i]=Integer.parseInt(array[i]);
            sum +=num[i];
        }
        return sum;
    }

}
