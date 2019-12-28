package cn.edu.nwsuaf.jp.p4.data;


public class Mp3Player extends cn.edu.nwsuaf.jp.p4.data.Product {
    private String name;

    /** Holds the price of the mobile. */
    private float price;

    private int RAM;
    /** Creates a new mobile object. */
    public Mp3Player(String name, float price,int RAM)
    {
//        cn.edu.nwsuaf.jp.p4.data.Product(name,price)；
        super(name,price);
        this.name = name;
        this.price = price;
        this.RAM = RAM;
    }

    /** Gets the name of the mobile. */
    public String getName() {
        return name;
    }
   public String getCounty(){return "";}
    public String getType(){return "Mp3Player";}
    /** Gets the price of the mobile. */
    public float getPrice() {
        return price;
    }
    public int getRAM(){
        return RAM;
    }
}
