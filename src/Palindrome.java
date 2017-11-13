import java.util.Scanner;

/**
 * Created by akhil on 24/05/17.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remind = number % 10;
            reverse = reverse * 10 + remind;
            number = number / 10;
        }

        System.out.print(reverse);
    }
}
