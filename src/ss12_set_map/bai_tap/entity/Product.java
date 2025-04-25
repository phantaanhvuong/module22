package ss12_set_map.bai_tap.entity;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private long price;

    public Product() {
    }

    public Product(int id, String nameProduct, long price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
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

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
    public String getInforToFile(){
        return this.id + "," +this.nameProduct + "," + this.price;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return id == product.id && price == product.price && Objects.equals(nameProduct, product.nameProduct);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nameProduct, price);
//    }
}
