import java.util.Scanner;

public class MainTaskPartTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String data = scanner.nextLine();
        String[] array = data.split(" ");
        System.out.println(sumNumbers(array));
        int monthNum = scanner.nextInt();
        System.out.println(month(monthNum));
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
    static String month(int num){
        String monthName;
        switch (num){
            case 1: monthName="Jan";
            break;
            case 2: monthName="Feb";
                break;
            case 3: monthName="Mar";
                break;
            case 4: monthName="Apr";
                break;
            case 5: monthName="May";
                break;
            case 6: monthName="Jun";
                break;
            case 7: monthName="Jul";
                break;
            case 8: monthName="Aug";
                break;
            case 9: monthName="Sep";
                break;
            case 10: monthName="Oct";
                break;
            case 11: monthName="Nov";
                break;
            case 12: monthName="Dec";
                break;
            default: monthName = "Incorrect! Enter number of month";
                break;
        }
        return monthName;
    }
}
