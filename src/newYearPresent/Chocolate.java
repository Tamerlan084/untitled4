package newYearPresent;

public class Chocolate {

    Ingredients ingredients;
    public Chocolate(String name) {
        this.setIngredients(name);
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(String name) {
        switch (name){
            case ("Dark"):
                this.ingredients = Ingredients.DARK;
                break;
            case ("Arriba"):
                this.ingredients = Ingredients.ARRIBA;
                break;
            case ("Milk"):
                this.ingredients = Ingredients.MILK;
                break;
        }
    }
}
