interface Printable{
    default void print(){
        System.out.println("Printable");
    }
}
interface Showable{
    static void print() {
        System.out.println("Showable");
    }
}

class TestTnterface1 implements Printable, Showable{

    public static void main(String[] args) {


        Showable.print();
        Printable d = new TestTnterface1();d.print();
    }

    
}
