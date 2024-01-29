import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        while(active){
            System.out.print("Enter your birthyear: ");
            try{
                int birthyear = scanner.nextInt();
                System.out.println("You will be " + (2050-birthyear) + " in 2050.");
            }catch (InputMismatchException e1){
                active = false;
            }


        }
    }
}