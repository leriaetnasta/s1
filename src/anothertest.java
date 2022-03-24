import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class anothertest {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Iterator<Integer> it=myList.iterator();
        while (it.hasNext()) {
                Integer elt = it.next();
        if (elt.equals(1)){
            System.out.println(elt);
            it.remove();
        }}

        System.out.println(myList);
    }
}
