import java.util.*;

public class HorseRiding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int left = 0;
        long sum = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++) {

            sum += arr[right];

            while(sum >= k) {
                sum -= arr[left++];
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}