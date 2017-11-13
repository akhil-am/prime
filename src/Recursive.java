/**
 * Created by akhil on 24/05/17.
 */
public class Recursive {

    public static void recursive(int n){
        if(n<=10){
            System.out.println(n);
            recursive(n+1);
        }

    }

    public static void main(String[] args) {
        recursive(1);
    }
}
