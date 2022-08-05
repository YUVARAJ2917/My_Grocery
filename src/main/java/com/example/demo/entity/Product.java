package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
/*@NamedQueries({
@NamedQuery(name="Product.getAllProducts",
    query="SELECT P FROM Product P")
})*/
@NamedQuery(name = "Product.getAllProducts", query = "SELECT o FROM Product o")
public class Product implements Serializable {

    private static final long serialVersionUID = 2820438214746344912L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private int price;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private List<SubCategory> subCategoryList;

    @Column(name = "image_id")
    private String imageId;

    @Column(name = "in_stock")
    private Boolean inStock;

    @Column(name = "offer_price")
    private int offerPrice;

    @Column(name = "offer_percentage")
    private int offerPercentage;

    @Column(name = "alia_name")
    private String aliasName;

    @Column(name = "description")
    private String description;

    @Column(name = "bar_code")
    private String barCode;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<SubCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<SubCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
    }

    public int getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(int offerPercentage) {
        this.offerPercentage = offerPercentage;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
