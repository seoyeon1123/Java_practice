package Operator1;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " +multi);

        int div = a / b; //5 나누기 2 는 2.5인데,
        // int 정수 에 속하기 때문에 소수점은 날라감 .
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " +mod);

    }
}
