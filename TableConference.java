import java.util.*;

public class TableConference {

    static long factorial(long n) {
        long fact = 1;

        for(long i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long result = 2 * factorial(n - 1);

        System.out.println(result);
    }
}