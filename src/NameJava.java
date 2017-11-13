/**
 * Created by akhil on 13/06/17.
 */
public class NameJava {
   Integer run(){
       System.out.println("name calss");
       return 0;
   }
}
class second{
     second  run(){
        System.out.println("second class");
        return null;
    }
}
class third extends second{
    void run(int a,int b){
        System.out.println("name calss");
    }
    @Override
     third run(){
      return null;
    }
    public static void main(String[] args) {
        //run();
        second t = new second();
        t.run();
    }
}
