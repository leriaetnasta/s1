/**
 * Compte
 */
public class Compte {
    private int pNumCompte;
    private String pNomProp;
    private double solde;

    Compte(String nom, double s) {
        this.pNomProp = nom;
        this.pNumCompte = NumCompte.generateur();
        this.solde = s;

    }

    public int getNumCompte() {
        return this.pNumCompte;
    }

    public String getProprietaire() {
        return this.pNomProp;
    }

    public double soldeCompte() {
        return this.solde;
    }

    public void setProprietaire(String pN) {
        this.pNomProp = pN;
    }

    public void retirer(double pS) {
        if (this.solde >= pS) {
            this.solde = this.solde - pS;
            System.out.println("retrait en succés");
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    public void deposer(double pS) {
        this.solde = this.solde + pS;
        System.out.println("Depot avec succés");
    }

    @Override
    public String toString() {
        String Affichage = "\n";
        Affichage += "Num de compte :" + this.pNumCompte + "\n";
        Affichage += "Proprietaire : " + this.pNomProp + "\n";
        Affichage += "Solde :" + this.solde + "\n";
        return Affichage;
    }

    public void Afficher() {
        System.out.println(this.toString());
    }

}