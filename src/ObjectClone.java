/**
 * Created by akhil on 17/06/17.
 */
public class ObjectClone implements Cloneable{
    int i, j;

    ObjectClone(){
        i=1;
        j=2;
    }

    public static void main(String[] args)  {
        ObjectClone ob = new ObjectClone();
        System.out.println(ob.i);
        System.out.println(ob.j);
        ObjectClone objectClone = null;
        try {
            objectClone = (ObjectClone) ob.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(objectClone.i);
        System.out.println(objectClone.j);
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
