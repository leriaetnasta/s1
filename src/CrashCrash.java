public class CrashCrash {
    public static void main(String[] arguments) {
        try {
            int[] chiffres = {} ; // un tableau vide
            // System.out.print(chiffres[0]);
            // OUPS
        }
        catch (Exception e){ System.out.println("[CRASH BORNE "+e+"] "); } try {
            System.out.print(1/0); // OUPS
        }
        catch (Exception e){ System.out.println("[CRASH DIV "+e+"] "); }
        try {
            Class.forName("UnProgrammeQuiNExistePas"); // OUPS
        }
        catch (Exception e){ System.out.println("[CRASH Exception "+e+"] "); }
        try {
            Integer[] tropGrandTableau =new Integer[1000000000]; // OUPS
        }
        catch (Error e){ System.out.println("[CRASH Error "+e+"] "); }
        System.out.println("Qu'il serait bon d'arriver ici ..."); }
}