package flowerGarden;

public enum Freshness {
    CUTTED(0, 3f),
    FRESH(1, 2f),
    OLD(2,0);

    private int condition;
    private float price;

    Freshness(int condition, float price) {
        this.setCondition(condition);
        this.setPrice(price);

    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
