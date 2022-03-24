import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nom;
    private List<Ingredient> ingredients;
    Pizza(String n){
        nom=n;
        ingredients= new ArrayList<Ingredient>();
    }
    public void ajouterIngredient(Ingredient i){
        this.ingredients.add(i);
    }
    public void IngredientLePlusUtilise(){
        Ingredient ing= new Ingredient();
        int max= ingredients.get(0).getQte();

        for (int i= 0; i<ingredients.size(); i++){
            if(ingredients.get(i).getQte()>max){
                max=ingredients.get(i).getQte();
                ing=ingredients.get(i);
            }

        }
        System.out.println("l'ingredient le plus utilisé est "+ ing.getNom() );

    }
    public String toString() {
        String st= "";
        st+= nom + " ";
        for (int i = 0; i <ingredients.size() ; i++) {
            st+=ingredients.get(i).toString();
        }
         return st;
        }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita");
        Ingredient i1= new Ingredient("sauce tomate",1);
        Ingredient i2= new Ingredient("onion",1);
        Ingredient i3= new Ingredient("thon",2);
        Ingredient i4= new Ingredient("fromage",5);
        p1.ajouterIngredient(i1);
        p1.ajouterIngredient(i2);
        p1.ajouterIngredient(i3);
        p1.ajouterIngredient(i4);
        System.out.println(p1.toString());
        p1.IngredientLePlusUtilise();

    }
}
