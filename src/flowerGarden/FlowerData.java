package flowerGarden;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

public class FlowerData {
    public HashMap<Integer, Float> getFreshness() {
        return freshness;
    }

    public void setFreshness(HashMap<Integer, Float> freshness) {
        this.freshness = freshness;
    }

    HashMap<Integer,Float> freshness = new HashMap<Integer,Float>();


}
