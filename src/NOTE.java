import java.util.Scanner;

public class NOTE {
    public static void main(String [] args){
        int chances=5;
        Scanner scan = new Scanner(System.in);
        int s,cpt=0,moy=0;
        String o;
        String c="collé",p="passable",b="bien",a="assez bien", t="trés bien",i="saisie invalid";


        while(cpt<3){
            System.out.println("entrer une note");
            s= scan.nextInt();
            if(s<0 || s>20){
                System.out.println("erreur de saisie");
                --cpt;
            }else{
                moy+=s;
            }


            ++cpt;
        }
            moy=moy/3;
            o = ((moy>=0 && moy<10) ? c : ((moy>=10 && moy<12) ? p: (moy>=12 && moy<14) ? a:((moy>=14 && moy<16) ? b:(moy>=16 && moy<20) ? t:i)));
            System.out.println(o);



    }
}
