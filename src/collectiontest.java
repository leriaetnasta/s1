import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectiontest {
    public static void main(String[] args) {
        List<String> lettres = new ArrayList<String>();
        lettres.add("d");
        lettres.add("b");
        lettres.add("a");
        lettres.add("c");
        Collections.sort(lettres);
        System.out.println(lettres);
        Collections.shuffle(lettres);
        System.out.println(lettres);
        List<String> sub= lettres.subList(1,2);
        System.out.println(sub);
        Collections.reverse(sub);
    }

}
