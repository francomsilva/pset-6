import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1;
        while(number <= 0) {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        }
        int sum = 0;
        String numberString = String.valueOf(number);
        int length = numberString.length();
        for(int i = 0; i < length; i++){
            String intSub = numberString.substring(i, i+1);
            int intAtString = Integer.parseInt(intSub);
            if(intAtString % 2 != 0){
                sum+= intAtString;
            }
        }
        System.out.println("\n" + sum + ".");
        input.close();
    }
}