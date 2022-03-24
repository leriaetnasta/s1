import java.util.ArrayList;
import java.util.List;

public class testarray {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        for(Object elt : myList) {
            if(elt.equals(1)){
                System.out.println(elt);
                myList.remove(1);
            }

        }

    }
}
