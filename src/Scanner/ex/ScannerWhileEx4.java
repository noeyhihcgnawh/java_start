package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int mainScanner = scanner.nextInt(); //메뉴선택 입력값 받기
            scanner.nextLine();
            // 스위치로 입력 번호 각각의 기능 구현
            if (mainScanner == 1) {
                //상품 입력 기능, 상품명+가격+구매수량 입력받고 총합 출력

                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                total += price * quantity; //구매물품 가격 누적
                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + total);
            } else if (mainScanner == 2) {
                if (total == 0) { //선택하지 않고 2번을 누를때 대비
                    System.out.println("결제하실 품목이 없습니다. 다시 시도해주세요");
                    continue; //메인메뉴로 복귀
                }
                System.out.println("총비용: " + total);
                total = 0; //결제 후 총 가격 초기화
            } else if (mainScanner == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else System.out.println("입력값이 올바르지 않습니다. 처음부터 다시 해주세요.");
            //구매하는 물품 가격 값 저장
        }


    }
}
