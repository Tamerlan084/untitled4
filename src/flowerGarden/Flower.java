package flowerGarden;

public class Flower {
    private String name;
    private Color color;
    private Freshness freshness;
    private float stemLength;
    private StemLengthPrice stemLengthPrice;

    public Flower(String name, String color, String freshness, float stemLength) {
        this.setName(name);
        this.setColor(color);
        this.setFreshness(freshness);
        this.setStemLength(stemLength);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        switch (color){
            case ("Yellow"):
                this.color = Color.YELLOW;
                break;
            case  ("Rose"):
                this.color = Color.ROSE;
                break;
            case  ("Green"):
                this.color = Color.GREEN;
                break;
            default:
                System.out.println("Change to colors Yelllow, Rose or Green");
        }
    }

    public Freshness getFreshness()
    {
        return freshness;
    }

    public void setFreshness(String freshness)
    {
        switch (freshness){
            case ("Just cutted"):
                this.freshness = Freshness.CUTTED;
                break;
            case  ("Fresh"):
                this.freshness = Freshness.FRESH;
                break;
            case  ("Old"):
                this.freshness = Freshness.OLD;
                break;
            default:
                System.out.println("Change to freshness \"Just cutted\", \"Fresh\" or \"Old\"");
        }

    }

    public float getStemLength()
    {
        return stemLength;
    }

    public void setStemLength(float stemLength)
    {
        if(stemLength>0&&10>stemLength)
        {
            this.stemLength = stemLength;
            this.stemLengthPrice = StemLengthPrice.SHORT;
        }else if(stemLength>=10&&stemLength<20)
        {
            this.stemLength=stemLength;
            this.stemLengthPrice=StemLengthPrice.MEDIUM;
        }else
        {
            this.stemLength=stemLength;
            this.stemLengthPrice=StemLengthPrice.LONG;
        }

    }
}
