/**
 * Created by akhil on 24/05/17.
 */
public class Pyramid {

    public static void main(String[] args) {
        int count = 10;

        for (int i =1;i< count; i++){
            for(int j=1;j<count-i;j++){
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.println(k);
            }
            for(int l=i-1;l>0;l--){
                System.out.println(l);
            }
        }
    }
}
