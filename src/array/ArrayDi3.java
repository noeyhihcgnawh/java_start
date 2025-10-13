package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}, //1행
                {4,5,6}  //2행
        };
        for (int row = 0; row < arr.length; row++){ //arr의 길이 (행의 길이)
            for (int column = 0; column < arr[row].length; column++){ //arr[row]의 길이 (열의 길이)
                System.out.print(arr[row][column] + ""); //배열 출력
            }
            System.out.println(); //줄 나누기
        }
    }
}
