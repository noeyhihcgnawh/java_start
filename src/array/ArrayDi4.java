package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2차원 배열 초기화
        int[][] arr = new int[4][5];

        //1씩 증가하는 변수
        int i = 1;

        //배열에 반복될수록 증가되는 i를 넣는다.
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; //반복될수록 i값 증가
            }
        }

        //배열 출력
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " "); //반복될수록 i값 증가
            }
            System.out.println();
        }
    }
}
