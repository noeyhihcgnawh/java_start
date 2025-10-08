package Scanner;

import java.util.Objects;
import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 입력해주세요(exit: 종료): ");
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("입력한 문자열: " + text);
            }
        }
    }
}
