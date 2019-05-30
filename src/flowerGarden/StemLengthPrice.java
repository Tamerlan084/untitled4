package flowerGarden;

public enum StemLengthPrice {
    LONG(3f),
    MEDIUM(2f),
    SHORT(1f);

    private float price;
    StemLengthPrice(float price) {
        this.setPrice(price);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
