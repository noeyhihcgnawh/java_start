package Scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("food Name?: ");
        String foodName = scanner.nextLine();

        System.out.print("food Price: ");
        int foodPrice = scanner.nextInt();

        System.out.print("food Quantity: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "입니다.");
    }
}
