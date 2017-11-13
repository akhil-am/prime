/**
 * Created by akhil on 24/05/17.
 */
public class Fibonacci {
static int  n1=0,n2=1,n3;
    public static void fib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);

            fib(count - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fib(8);
    }
}
