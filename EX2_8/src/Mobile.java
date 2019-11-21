package cn.edu.nwsuaf.jp.p4.data;


public class Mobile extends  cn.edu.nwsuaf.jp.p4.data.Product {
    /** Holds the name of the mobile. */
    private String ProductCounty;

    private String name;

    /** Holds the price of the mobile. */
    private float price;

    /** Creates a new mobile object. */
    public Mobile(String ProductCounty,String name, float price)
    {
        super(name,price);
        this.ProductCounty = ProductCounty;
        this.name = name;
        this.price = price;
    }

    /** Gets the name of the mobile. */
    public String getName() {
        return name;
    }
    public int getRAM() {return 0;}
    public String getType(){return "Mobile";}
    public String getCounty(){return ProductCounty;}
    /** Gets the price of the mobile. */
    public float getPrice() {
        return price;
    }
}

