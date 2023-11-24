package com.example.foodorderapp.Models;

public class OrdersModel {
    int ordreImage;
    String soldItemnName , price , orderNumber;

    public OrdersModel(int ordreImage, String soldItemnName, String price, String orderNumber) {
        this.ordreImage = ordreImage;
        this.soldItemnName = soldItemnName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrdreImage() {
        return ordreImage;
    }

    public void setOrdreImage(int ordreImage) {
        this.ordreImage = ordreImage;
    }

    public String getSoldItemnName() {
        return soldItemnName;
    }

    public void setSoldItemnName(String soldItemnName) {
        this.soldItemnName = soldItemnName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
