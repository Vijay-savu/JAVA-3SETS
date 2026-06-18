import java.util.*;

public class TogglingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);
        StringBuilder toggled = new StringBuilder();

        for(char c : binary.toCharArray()) {
            toggled.append(c == '0' ? '1' : '0');
        }

        System.out.println(Integer.parseInt(toggled.toString(), 2));
    }
}