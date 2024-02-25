package model;

import java.time.LocalDate;

public class Product {
    private String productCode;
    private String productName;
    private Double productPrice;
    private Integer qty;
    private LocalDate date;

    public Product(String productCode, String productName, Double productPrice, Integer qty, LocalDate date) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.qty = qty;
        this.date = date;
    }

    public Product(){}


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
