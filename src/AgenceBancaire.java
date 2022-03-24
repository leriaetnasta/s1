import java.util.ArrayList;
import java.util.List;

public class AgenceBancaire {
    private String pNomAgence;
    private String pLocAgence;
    private List<Compte> comptes = new ArrayList<Compte>();

    AgenceBancaire(String pnom, String ploc) {
        this.pLocAgence = ploc;
        this.pNomAgence = pnom;

    }

    public String getNomAgence() {
        return this.pNomAgence;
    }

    public String getLocAgence() {
        return this.pLocAgence;
    }

    public int getNbComptes() {
        return this.comptes.size();
    }

    public Compte getCompte(int pNum) {
        int z = 0;
        for (int i = 0; i < this.comptes.size(); i++) {

            if (this.comptes.get(i).getNumCompte() == pNum) {
                System.out.println("Compte trouve");
                z = i;
            }
        }
        return this.comptes.get(z);
    }

    public void addCompte(Compte p) {
        String x;
        x = p.getProprietaire();
        System.out.println(x + " a ete ajoute a l'agence");
        this.comptes.add(p);
    }

    public void removeCompte(int nC) {

        for (int i = 0; i < this.comptes.size(); i++) {
            Compte c;
            if (this.comptes.get(i).getNumCompte() == nC) {

                c = this.comptes.get(i);
                this.comptes.remove(c);
                System.out.println(c.getProprietaire() + " a ete supprimer avec succes");
            }
        }

    }

    @Override
    public String toString() {
        String Affichage = "";
        Affichage += "Nom agence : " + this.pNomAgence + "\n";
        Affichage += "Localisation agence : " + this.pLocAgence + "\n";
        for (int i = 0; i < this.comptes.size(); i++) {

            Affichage += this.comptes.get(i).toString();
        }
        return Affichage;
    }

    public List<Compte> getCompteDe(String pNom) {
        List<Compte> comptede = new ArrayList<Compte>();
        for (int i = 0; i < this.comptes.size(); i++) {
            if (this.comptes.get(i).getProprietaire() == pNom) {
                comptede.add(this.comptes.get(i));
            }
        }
        return comptede;
    }
    public static void main(String[] args) {
        Compte c1 = new Compte("Reda", 1200);
        Compte c2 = new Compte("Aymane", 1500);
        Compte c3 = new Compte("Ahmed", 2000);
        Compte c4 = new Compte("Nizar", 1000);

        AgenceBancaire a1 = new AgenceBancaire("CIH", "Chari3 lqods");

        System.out.println("Ajout des comptes : ");
        System.out.println("--------------------------------------------------");
        a1.addCompte(c1);
        a1.addCompte(c2);
        a1.addCompte(c3);
        a1.addCompte(c4);

        System.out.println("--------------------------------------------------");
        System.out.println("Nom de l'agence : " + a1.getNomAgence());
        System.out.println("Position de l'agence : " + a1.getLocAgence());
        System.out.println("Nomvre de comptes dans l'agence : " + a1.getNbComptes());

        System.out.println("Recuperer le compte 4 et l'afficher ");
        System.out.println("--------------------------------------------------");
        a1.getCompte(4).Afficher();

        System.out.println("Supprimer le compte de Nizar");
        System.out.println("--------------------------------------------------");
        a1.removeCompte(4);

        System.out.println("Recuperer le compte de reda et l'afficher ");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println(a1.getCompteDe("Reda").toString());

        System.out.println("Combien de comptes dans l'agence :");
        System.out.println("--------------------------------------------------");
        System.out.println(a1.getNbComptes());

        System.out.println("Afficher tout les comptes qui exicte dans l'agence");
        System.out.println("--------------------------------------------------");
        System.out.println(a1.toString());
    }
}
