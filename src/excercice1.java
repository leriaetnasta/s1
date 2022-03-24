public class excercice1 {
    public static void main(String [] args){
        for(int i=0;i<args.length;i++){
            if(i==0){
                System.out.println(args[i]);
            }else if( i>0 && i<args.length){
                System.out.println(args[i]+ " , ");
            }
            else if (i == args.length) {
                System.out.println("et" + args[i]);
            }
        }

    }
}
