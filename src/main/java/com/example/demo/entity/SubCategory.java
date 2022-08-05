package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rmuruganantham 2018-05-03
 */
@Entity
@Table(name = "SUB_CATEGORY")
public class SubCategory implements Serializable{

    private static final long serialVersionUID = 5163322082128240826L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Sub_Category_id")
    private long subCategoryId;

    @Column(name = "Sub_Category_name")
    private String subCategoryName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private int price;

    @Column(name = "wight")
    private int wight;

    @Column(name = "product_id")
    private Integer productId;

    public SubCategory() {
    }

    public long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
