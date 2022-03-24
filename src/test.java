import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        System.out.println("taille : " + myList.size());

        myList.add("Lundi");
        myList.add("mardi");
        myList.add("mercredi");
        myList.add("jeudi");
        myList.add("vendredi");
        myList.add("samedi");
        myList.add("dimanche");

       String jour=myList.get(3);
       System.out.println("taille : " + myList.size());
       System.out.println("le 4eme jour est"+jour);
       String removeDay=myList.remove(6);
        System.out.println(removeDay+"a été enlevé");
        System.out.println("taille : " + myList.size());

    }
}
