package model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private int quantity;
    private String describe;
    public static int idIncrement;

    public Product(String nameProduct, double price, int quantity, String describe) {
        this.id = idIncrement;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
        idIncrement++;
    }

    public Product(int idEdit, String nameProduct, double price, int quantity, String describe) {
        this.id = idEdit;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        Product.idIncrement = idIncrement;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String getData() {
        return id + "," + nameProduct + "," + price + "," + quantity + "," + describe;
    }
}
