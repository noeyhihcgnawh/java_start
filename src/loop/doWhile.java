package loop;

public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " + sum);
                break;
            }
        }
    }
}
