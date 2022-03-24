import java.util.StringTokenizer;

public class excercice {
    public static void main(String [] args){
        String test[] = new String [4];
        test[0]="exam";
        test[1]="pour";
        test[2]="bientot";
        test[3]="!";
        for (int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
        for(String val:test){
            System.out.println(val+ " ");
        }
        String s1="TATA";
        String s2="TATA";
        String s3= new String("TATA");
        String s4= new String("TATA");
        String s5= s3;
        String s6= null;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s5==s3);
        StringTokenizer st=new StringTokenizer("cours JAVA");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        String[] result= "les examens sont pour bientot".split("\\s");
        for(String name:result)
            System.out.println(name);

        for(int i=0;i<args.length;i++)
            System.out.println(args[i]+" ");

    }

}
