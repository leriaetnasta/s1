public class NumCompte {
    private static int num_compte = 0;
    public static int generateur() {
        num_compte++;
        return num_compte;

    }

    public static void main(String[] args) {
        NumCompte num = new NumCompte();
        num.generateur();
        System.out.println(num);
    }


}
