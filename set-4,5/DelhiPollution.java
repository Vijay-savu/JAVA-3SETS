import java.util.*;

public class DelhiPollution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int fine = sc.nextInt();

        int totalFine = 0;

        for(int num : arr) {
            if(d % 2 == 0) {
                if(num % 2 != 0)
                    totalFine += fine;
            } else {
                if(num % 2 == 0)
                    totalFine += fine;
            }
        }

        System.out.println(totalFine);
    }
}