import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(this.price) + "\n";
    }

    //returns instanceof
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Product;
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        return NumberFormat.getInstance().format(price);
    }

    // abstract method
    public abstract String myAbstractMethod();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
}