package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // 입력 숫자를 모두 받는 변수
        int count = 0; // 평균 계산을 위한 입력 숫자 카운트 변수
        int num = 0; // 입력값을 받는 변수
        System.out.println("숫자를 입력해주세요. 입력을 중단하려면 -1을 입력하세요: ");

        while (true) {
            num = scanner.nextInt(); //입력
            if (num == -1) { // -1을 입력받으면 반복문 종료.
                break;
            }
            sum += num; //sum에 입력값 모두 저장
            count++; //입력값 입력 받을때마다 카운트
        }
        int ave = sum / count; //평균 구하기
         System.out.println("입력한 숫자들의 합계: " + sum);
         System.out.println("입력한 숫자들의 평균: " + ave);
    }
}
