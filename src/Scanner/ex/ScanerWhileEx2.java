package Scanner.ex;

import java.util.Scanner;

public class ScanerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            String price = scanner.nextLine();
            int intPrice = Integer.parseInt(price);

            if (price.equals("-1")) {
                System.out.println("-1을 입력하였으므로 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요 (-1을 입력하면 종료): ");
            String quantity = scanner.nextLine();
            int intQuantity = Integer.parseInt(quantity);

            if (quantity.equals("-1")) {
                System.out.println("-1을 입력하였으므로 종료합니다.");
                break;
            }

            int totalPrice = intPrice + intQuantity;

            System.out.println("총 비용: " + totalPrice);
        }
    }
}
