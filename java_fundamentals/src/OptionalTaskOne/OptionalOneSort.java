package OptionalTaskOne;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalOneSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");
        System.out.println(Arrays.toString(array));
        sortNumbers(array);
    }

    static void sortNumbers(String[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i].length()<array[i+1].length()){
                    String temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    sorted=false;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
