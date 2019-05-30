package flowerGarden;


public enum Color {


    YELLOW("Yellow",1f),
    ROSE("Rose",1f),
    GREEN("Green",1f);


    private String name;
    private float price;
    Color(String name, float price) {
        this.setPrice(price);
        this.setName(name);


    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
