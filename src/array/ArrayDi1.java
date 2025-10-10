package array;

import java.sql.SQLOutput;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2차원 배열
        int[][] arr = new int[2][3]; //2 row 3 column

        arr[0][0] = 1; //0 row, 0 column
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4; //1 row, 0 column
        arr[1][1] = 5;
        arr[1][2] = 6;

        //1. 행만 반복문으로
        /* for (int row = 0; row < 2; row++){
            System.out.print(arr[row][0] + " "); //row는 for문으로 반복, 0열 출력
            System.out.print(arr[row][1] + " "); //1열 출력
            System.out.print(arr[row][2] + " "); //2열 출력
            System.out.println(); //한 행이 끝나면 라인 변경
        } */

        //2. 행 열 둘 다 반복문으로 해보기
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //commit
    }
}
