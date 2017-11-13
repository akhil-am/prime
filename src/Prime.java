/**
 * Created by akhil on 24/05/17.
 */
public class Prime {



    public static void main(String[] args) {

        int number = 50;
        int num= 0;
        for(int i =2;i<=number;i++){
            int count = 0;
            for(int j=2;j<=i/2;j++){

                if(i%j==0) {
                    count++;break;
                }

            }
            if(count==0){
                System.out.println(i);
                num++;
            }
        }
        System.out.println(num);
    }
}
