/**
 * Created by akhil on 15/06/17.
 */
public abstract class Abstract {
    void test(){
        System.out.print("");
    }
    int a ;
    static  int c;
    abstract void test1();
}
class test extends Abstract{
    @Override
    void test() {
        super.test();
    }

    @Override
    void test1() {
        System.out.print("invloked");
    }

    public static void main(String[] args) {
        Abstract a = new test();
        a.test1();
    }
}
