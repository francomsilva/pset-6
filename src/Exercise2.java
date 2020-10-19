import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userDouble = 0.0;
        while(userDouble <= 0) {
            System.out.print("Enter an Integer: ");
            userDouble = input.nextDouble();
        }
        int userInt = (int) userDouble;

        String usrString = String.valueOf(userInt);
        int length = usrString.length();

        for(int i = length-1; i > -1; i--) {
            String subInt = usrString.substring(i, i+1);
            if(i == 0){
                System.out.print(subInt + ". ");
            }
            else {
                System.out.print(subInt + ", ");
            }
        }
        System.out.println();
        input.close();
    }
}