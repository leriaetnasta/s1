import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Client implements java.io.Serializable {
        String NumeroCIN;
        String Nom;
        String prenom;
        Client(String c,String n,String p) {
            NumeroCIN = c;
            Nom=n;
            prenom=p;
        }

    public static void main(String[] args) {
        Client monclient = new Client("1234","loubna","talha");
        try{
            FileOutputStream fs= new FileOutputStream("monservfile.txt");
            ObjectOutputStream os= new ObjectOutputStream(fs);
            os.writeObject(monclient);
            os.close();
        } catch(IOException e){
            e.printStackTrace();
        }

    }

}
