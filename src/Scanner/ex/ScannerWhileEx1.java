package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("what's your name? (typing Exit: exit): ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                System.out.println("Program Exit.");
                break;
            }

            System.out.print("how old are you?: ");
            String age = scanner.nextLine();
            int ageInteger = Integer.parseInt(age);



            System.out.println("Your Name is: " + name + " / Age: " + ageInteger);
        }
    }
}
