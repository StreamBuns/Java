package cn.edu.nwsuaf.jp.p4.data;


public abstract class Product implements Comparable<Product> {
    /** Holds the name of the product. */
    protected String name;

    /** Holds the price of the product. */
    protected float price;
    /** Holds the number of products. */
    protected static int count;

    /** Create a new product object. */
    protected Product(String name, float price) {
        this.name = name;
        this.price = price;
        ++count;
    }
    /** Gets the name of the product. */
    public String getName() {
        return name;
    }

    /** Gets the price of the product. */
    public float getPrice() {
        return price;
    }

    /** Gets the number of products. */
    public static int getCount() {
        return count;
    }

    abstract public String getCounty();
    abstract public int getRAM();
    abstract public String getType();
    /** Compares this product with the given product. */
    public int compareTo(Product product) {
        return new Float(product.getPrice()).compareTo(price);
    }
}

