package newYearPresent;

public enum Ingredients {
    DARK("Dark", 97.7f,0.1f,0f,2.2f,90f),
    ARRIBA("Arriba",77.7f,10.0f,10.0f,2.3f,90f),
    MILK("Milk",38.8f,25.0f,32.0f,4.2f,90f);

    private String name;
    private float cacao;
    private float sugar;
    private float milk;
    private float butter;
    private float wight;
    Ingredients(String name, float cacao, float sugar, float milk, float butter, float wight) {
        this.setName(name);
        this.setCacao(cacao);
        this.setSugar(sugar);
        this.setMilk(milk);
        this.setButter(butter);
        this.setWight(wight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCacao() {
        return cacao;
    }

    public void setCacao(float cacao) {
        this.cacao = cacao;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getMilk() {
        return milk;
    }

    public void setMilk(float milk) {
        this.milk = milk;
    }

    public float getButter() {
        return butter;
    }

    public void setButter(float butter) {
        this.butter = butter;
    }

    public float getWight() {
        return wight;
    }

    public void setWight(float wight) {
        this.wight = wight;
    }
}
