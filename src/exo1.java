import java.util.Scanner;

public class exo1 {
    public static void main(String [] args){

        int chances=5;
        Scanner scan = new Scanner(System.in);
        int s;
        while (chances!=0){

            System.out.println("entrer un nombre");
            s= scan.nextInt();
            if(s<1 || s>10)
                --chances;

        }
    }

}
