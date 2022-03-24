public class Ingredient {
    private String nom;
    private int qte;
    Ingredient(){
        nom="";
        qte=0;
    }
    Ingredient(String n, int q){
        nom=n;
        qte=q;
    }
    public String toString(){
        return "\nIng: "+this.nom + "\n qte: "+ this.qte;
    }
    public int getQte() {
        return qte;
    }

    public String getNom() {
        return nom;
    }
}
