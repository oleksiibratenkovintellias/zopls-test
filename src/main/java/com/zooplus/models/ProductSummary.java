package com.zooplus.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class ProductSummary {

    Integer productId;
    String productName;
    String categoryName;
    Double price;
    LocalDateTime processedAt;

    public ProductSummary(Integer productId, String productName, String categoryName, Double price, LocalDateTime processedAt) {
        this.productId = productId;
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
        this.processedAt = processedAt;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(LocalDateTime processedAt) {
        this.processedAt = processedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductSummary that = (ProductSummary) o;
        return Objects.equals(productId, that.productId) && Objects.equals(productName, that.productName)
            && Objects.equals(categoryName, that.categoryName) && Objects.equals(price, that.price)
            && Objects.equals(processedAt, that.processedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, categoryName, price, processedAt);
    }
}
