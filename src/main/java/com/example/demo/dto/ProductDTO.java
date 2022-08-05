package com.example.demo.dto;

import com.example.demo.entity.SubCategory;

import javax.persistence.*;
import java.util.List;

/**
 * @author rmuruganantham 2018-05-09
 */
public class ProductDTO {

    private String productName;

    private int price;

    private List<SubCategory> subCategoryList;

    private String imageId;

    private Boolean inStock;

    private int offerPrice;

    private int offerPercentage;

    private String aliasName;

    private String description;

    private String barCode;

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
