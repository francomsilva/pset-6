import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            if(number < 0){
                break;
            }else{
                sum += number;
                count ++;
            }
        }
        double avg = (double) sum/count;
        System.out.println();
        if (Double.isNaN(avg)){
            System.out.println("Error: division by zero");
        }else{
            System.out.printf("%,.2f.", avg);
            System.out.println();
        }
        input.close();
    }
}