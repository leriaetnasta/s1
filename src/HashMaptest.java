import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaptest {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(12,"geeks");
        hm.put(2,"practice");
        hm.put(7,"devs");
        System.out.println(hm);
        hm.put(12,"geeks");
        System.out.println(hm);
        Set s = hm.entrySet();
        Iterator it= s.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        for(Map.Entry<Integer,String> entry:hm.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

}
