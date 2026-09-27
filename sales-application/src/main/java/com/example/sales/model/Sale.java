package com.example.sales.model;



public class Sale {

    private int id;
    private String customerName;
    private String carName;
    private double price;


    public Sale() {
    }

    public Sale(int id, String customerName, String carName, double price) {
        this.id = id;
        this.customerName = customerName;
        this.carName = carName;
        this.price = price;
    }

   
    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarName() {
        return carName;
    }

    public double getPrice() {
        return price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
