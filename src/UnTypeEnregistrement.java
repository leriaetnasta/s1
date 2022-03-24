public class UnTypeEnregistrement {
    String champChaine;
    int champEntier;
    double champPrivateDouble;
    private UnTypeEnregistrement(){
        String champChaine = "champ" ;
        int champEntier = 0 ;
    }
    private UnTypeEnregistrement(String cc){

        champChaine=cc;
    }

    private UnTypeEnregistrement(int ce){
        champEntier=ce;
    }
    private UnTypeEnregistrement(String cc,int ce){
        champChaine=cc;
        champEntier=ce;
    }
    private UnTypeEnregistrement(double pfValeurInitialeDouble){
        champPrivateDouble=pfValeurInitialeDouble;
    }
    public static void main(String[] arguments) {
        UnTypeEnregistrement unEnregistrement = new UnTypeEnregistrement();
        System.out.println("unEnregistrement.champChaine = "+unEnregistrement.champChaine);
        System.out.println("unEnregistrement.champEntier = "+unEnregistrement.champEntier);
    }
}
