public class UneLibrairie {
    static String staticstring = "variable globale" ;
    static int staticint = 0 ;
    static void staticvoid(){
        System.out.print("staticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
    }
    public static void publicstaticvoid(){
        System.out.print("publicstaticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
    }
    private static void privatestaticvoid(){
        System.out.print("privatestaticvoid()");
        staticstring = staticstring + 1 ;
        staticint = staticint + 1 ;
    }
    public static void main(String[] arguments) {

        System.out.print("depuis UneLibrairie.main() : ");
        System.out.print("appel de : ");
        staticvoid();
        System.out.println(" : OK");
        publicstaticvoid();
        privatestaticvoid();
    }
}
