import java.util.*;

public class PriorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(num > max) {
                count++;
                max = num;
            }
        }

        System.out.println(count);
    }
}