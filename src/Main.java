package src;

import java.io.NotActiveException;

public class Main {
    public static void main(String[] args) {
        try{
            int checkNumber = 10;
            int number1 = 0;
            int number2 = 10;

            boolean result = checkRange(checkNumber, number1, number2);
            if (result) {
                System.out.println(checkNumber + " is in the range.");
            } //else {
//                System.out.println(checkNumber + " Isn't in the range.");
//            }

            } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
    public static boolean checkRange (int checkNumber, int number1, int number2){
        if (checkNumber >= number1 && checkNumber <= number2){
            return true;
        } else {
            throw new IllegalArgumentException("Error: Number isn't in the range!");
        }
    }
}
