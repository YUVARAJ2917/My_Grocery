package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rmuruganantham 2018-05-05
 */
@Entity
@Table(name = "Order_Line")
public class OrderLine implements Serializable{
    private static final long serialVersionUID = -6617450864047890106L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_line_id")
    private long orderLineId;

    @Column(name = "product_Name")
    private String productName;

    @Column(name = "subcategory_Name")
    private String subcategoryName;

    @Column(name = "price")
    private int price;

    @Column(name = "product_Img_Id")
    private String productImgId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "weight")
    private int weight;

    @Column(name = "order_id")
    private Integer orderId;

    public long getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(String productImgId) {
        this.productImgId = productImgId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
