package src;

import java.io.NotActiveException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean isInRange = checkRange(11, 0, 10);
        System.out.println("The number is in range: " + isInRange);
        System.out.println("end!");
    }
    public static boolean checkRange (int checkNumber, int number1, int number2) throws Exception {
        if (checkNumber <= number1 || checkNumber >= number2){
            throw new Exception("Error: Number isn't in the range!");

        } else {
            return true;
        }
    }
}
