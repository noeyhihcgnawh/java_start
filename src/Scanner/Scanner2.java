package Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        int input = scanner.nextInt();

        System.out.print("두번째 숫자: ");
        int input2 = scanner.nextInt();

        int sum = input + input2;
        System.out.println("합: " + sum);
    }
}
