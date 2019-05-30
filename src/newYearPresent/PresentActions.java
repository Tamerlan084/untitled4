package newYearPresent;

import java.util.ArrayList;

public class PresentActions {

    public static void addChocolate(Present present, Chocolate chocolate)
    {
        present.chocolateList.add(chocolate);
    }

    public static void sortChocolates(Present present)
    {
        ArrayList<Chocolate> sortedChocolates = new ArrayList<Chocolate>();

        for(Ingredients ingredient : Ingredients.values())
        {
            for(Chocolate chocolate : present.chocolateList)
            {
                if(ingredient.equals(chocolate.ingredients))
                {
                    sortedChocolates.add(chocolate);
                }
            }
        }
        present.chocolateList.clear();
        present.chocolateList.addAll(sortedChocolates);
    }

    public static Chocolate getChocolateFromSugarRange(Present present, int min, int max)
    {
        Chocolate choco = null;
        for(Chocolate chocolate : present.chocolateList)
        {
            if(chocolate.getIngredients().getSugar()<=max&&chocolate.getIngredients().getSugar()>=min)
            {
                choco = chocolate;
                break;
            }
        }
        return choco;
    }
}
