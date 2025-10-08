package loop.ex;

import java.util.Scanner;

public class NestedEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄을 생성하시겠습니까?: ");
        int rows = scanner.nextInt();
        System.out.println(rows + "줄");
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
