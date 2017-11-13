/**
 * Created by akhil on 18/06/17.
 */
class aa extends Object{
  protected    static void a(){
         System.out.println("a.........");
    }
}
public class TEST extends aa {

  protected static void a(){

    }
    public static void main(String[] args) {

aa.a();
        String d = new String("a").intern();
        String a ="a";
        Object oo = new String("a");
        String dd = "";
        String cc = null;
        String b = a.concat("b");
        String c = "ab";
       System.out.println(oo==a);
       // System.out.println(a+dd);

       Runnable runnable= new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running on different thread");
            }
        });
        thread.start();

    }
//    Thread thread = new Runnable(){
//        @Override
//        public void run() {
//
//        }
//    }



}
