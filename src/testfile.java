import java.io.FileWriter;
import java.io.IOException;

public class testfile {
    public static void main(String[] args) {
        FileWriter out;
        try{
            out = new FileWriter("conserverdoha");

            String sentence = "les examens approches!!";
            out.write(sentence);
            for(int i=0;i<=11;i++){
                out.write(sentence , 0, i);
                out.write("\n", 0,1);
            }
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
