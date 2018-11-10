package com.example.rayold.everydayneeds.activities;

public class Service {
    private int _id;
    private String _serviceName;
    private int _price;

    public Service() {
    }
    public Service(int id, String service, int price) {
        _id = id;
        _serviceName = service;
        _price = price;
    }
    public Service( String service, int price) {
        _serviceName = service;
        _price = price;
    }

    public void setID(int id) {
        _id = id;
    }
    public int getID() {
        return _id;
    }
    public void setServiceName(String serviceName) {
        _serviceName = serviceName;
    }
    public String getServiceName() {
        return _serviceName;
    }
    public void setPrice(int price) {
        _price = price;
    }
    public int getPrice() {
        return _price;
    }
}
