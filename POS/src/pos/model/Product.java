/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.model;

/**
 *
 * @author Admin
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private double quantity;
    private int supplierId;
    private String categoryName;
    private String supplierName;

    public Product() {
    }

    public Product(int id, String name, double price, double quantity, int supplierId, String categoryName, String supplerName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.categoryName = categoryName;
        this.supplierName = supplerName;
    }

    public Product(int id, String name, double price, double quantity, String categoryName, String supplerName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.categoryName = categoryName;
        this.supplierName = supplerName;
    }

    public Product(int id, String name, double price, double quantity, int supplierId, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.categoryName = categoryName;
    }

    public Product(String name, double price, double quantity, int supplierId, String categoryName) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", supplierId=" + supplierId + ", categoryName=" + categoryName + ", supplierName=" + supplierName + '}';
    }

}
