import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = 0;
        while (height <= 0 || height > 24){
            System.out.print("Height: ");
            height = input.nextInt();
        }
        int size = height;
        String[] poundArray = new String[size];
        for(int i = 0; i < size; i++){
            poundArray[i] = "#";
        }
        System.out.println();
        int pound = 2;
        for(int i = 1; i < height; i++){
            int spaces = height - pound;

            for (int j = 0; j <= spaces; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < pound; k++){
                System.out.print(poundArray[k]);
            }
            pound++;
            System.out.println();
            input.close();
        }
    }
}