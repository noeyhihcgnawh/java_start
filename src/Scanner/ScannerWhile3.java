package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력해주세요(0 입력 시 종료): ");
            int num = scanner.nextInt();
            sum += num;

            if (num == 0) {
                System.out.println("0을 입력하였기에 프로그램을 종료합니다.");
                System.out.println("숫자의 총 합: " + sum);
                break;
            }
        }
    }
}
