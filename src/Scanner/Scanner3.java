package Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("더 큰 수: " + num2);
        } else if (num1 > num2) {
            System.out.println("더 큰 수: " + num1);
        } else System.out.println("두 수는 같은 값입니다.");
    }
}
