package flowerGarden;

import java.util.ArrayList;

public class BouquetActions {

    public static void addFlower(Flower flower, Bouquet bouquet)
    {
        bouquet.listOfFlowers.add(flower);
    }

    public static void   sortFlowers(Bouquet bouquet)
    {
        ArrayList<Flower>  sortedList = new ArrayList<Flower>();

        for (Freshness freshness: Freshness.values())
        {
            for(Flower flower : bouquet.listOfFlowers)
            {
                if(freshness.equals(flower.getFreshness()))
                {
                    sortedList.add(flower);
                }
            }
        }
        bouquet.listOfFlowers.clear();
        bouquet.listOfFlowers.addAll(sortedList);
    }

    public static Flower getFlowerInStemRange(Bouquet bouquet, int min, int max)
    {
        Flower grass = null;
        for(Flower flower : bouquet.listOfFlowers)
        {
            if(flower.getStemLength()<=max&&flower.getStemLength()>=min)
            {
                grass = flower;
                break;
            }
        }
        return grass;
    }
}
