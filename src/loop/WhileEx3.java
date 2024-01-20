package loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 100;

        while (1 <= max) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);


    }
}