import java.util.*;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int temp = i;
            int power = String.valueOf(i).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, power); 
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        in.close();
    }
}
