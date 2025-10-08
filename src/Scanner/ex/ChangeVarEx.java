package Scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        //start
        temp = a;
        a = b;
        b = temp;
        //end


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
