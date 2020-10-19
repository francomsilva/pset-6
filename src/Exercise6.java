import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = -1;
        while(integer <0 || integer > 92) {
            System.out.print("Enter an Integer: ");
            integer = input.nextInt();
        }
        int size = integer;
        long[] fibonacciArray = new long[size];
        for(int i = 0; i < size; i++){
            if(i-1 >=0 && i - 2 >= 0){
                fibonacciArray[i] = (fibonacciArray[i-2]+fibonacciArray[i-1]);
            }
            else if (i == 0) {
                fibonacciArray[i] = 0;
            }
            else if (i == 1){
                fibonacciArray[i] = 1;
            }
        }
        System.out.printf("%,d.", fibonacciArray[integer-1]);
        System.out.println();
        input.close();
    }
}