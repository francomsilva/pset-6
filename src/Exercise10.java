import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String cardType;
        boolean valid = false;
        System.out.print("Enter a credit card number: ");
        String cardNumber = input.nextLine();
        for(int i = cardNumber.length()-2; i >=0; i-=2){
            int val = 2 * Integer.parseInt(Character.toString(cardNumber.charAt(i)));
            int firstDigit = val / 10;
            int secondDigit = val - firstDigit * 10;
            int digitSum = firstDigit + secondDigit;
            sum += digitSum;
        }
        for(int i = cardNumber.length() - 1; i >= 0; i -=2){
            sum += Integer.parseInt(Character.toString(cardNumber.charAt(i)));
        }
        String sumStr = Integer.toString(sum);
        if(Character.toString(sumStr.charAt(sumStr.length()-1)).equals("0")){
            valid = true;
        }
        int cardNumberLength = cardNumber.length();
        int firstTwoNumbers = Integer.parseInt(cardNumber.substring(0,2));
        int firstNumber = Integer.parseInt(Character.toString(cardNumber.charAt(0)));

        if((firstTwoNumbers == 34 || firstTwoNumbers == 37) && cardNumberLength == 15){
            cardType = "American Express.";
        }
        else if (firstTwoNumbers >= 51 && firstTwoNumbers <= 55 && cardNumberLength == 16){
            cardType = "Mastercard.";
        }
        else if(firstNumber == 4 && (cardNumberLength == 14 || cardNumberLength == 16)){
            cardType = "Visa.";
        }
        else {
            cardType = "Invalid.";
        }
        if(cardType.equals("Invalid.") || !valid){
            System.out.println("\nInvalid.");
        }else{
            System.out.println("\n" + cardType);
        }
        input.close();
    }
}