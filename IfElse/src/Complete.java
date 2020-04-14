import java.util.Scanner;

public class Complete {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
           final int num = 10;

           System.out.println("Please enter a number");
            int number = keyboard.nextInt();

            if (number > num) {
                System.out.println("Number is greater than 10.");
            }
            else if (number < num ){
                System.out.println("Number is less than 10.");
            } else {
                System.out.println("Application finished.");
        }
    }
}
