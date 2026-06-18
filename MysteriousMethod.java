import java.util.*;

public class MysteriousMethod {

    static int digitSum(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if(r == 0) {
            System.out.println(0);
            return;
        }

        int sum = digitSum(n) * r;

        while(sum >= 10) {
            sum = digitSum(sum);
        }

        System.out.println(sum);
    }
}