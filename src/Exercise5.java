import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int userInput;
        do {
            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
        }
        while (userInput < 0);
        for (int k = 2; k < Math.sqrt(userInput); k++) {
            if (userInput % k == 0) {
                number = k;
                break;
            }
        }
        if (number != 0) {
            System.out.println("Not prime.");
        }
        else {
            System.out.println("Prime.");
        }
        input.close();

    }
}