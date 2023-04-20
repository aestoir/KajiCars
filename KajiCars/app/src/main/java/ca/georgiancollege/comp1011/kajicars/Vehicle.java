package ca.georgiancollege.comp1011.kajicars;

import java.time.LocalDate;
import java.util.List;

public class Vehicle {
    private String make;
    private String model;
    private String condition;
    private String engineCylinders;
    private int year;
    private int numDoors;
    private double price;
    private String color;
    private String thumbnailImagePath;
    private String fullSizedImagePath;
    private LocalDate dateSold;


    public Vehicle(String make, String model, String condition, String engineCylinders, int year, int numDoors, double price, String color, String thumbnailImagePath, String fullSizedImagePath) {
        this.make = make;
        this.model = model;
        this.condition = condition;
        this.engineCylinders = engineCylinders;
        this.year = year;
        this.numDoors = numDoors;
        this.price = price;
        this.color = color;
        this.thumbnailImagePath = thumbnailImagePath;
        this.fullSizedImagePath = fullSizedImagePath;
    }


    // Getters and Setters for all the attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(String engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThumbnailImagePath() {
        return thumbnailImagePath;
    }

    public void setThumbnailImagePath(String thumbnailImagePath) {
        this.thumbnailImagePath = thumbnailImagePath;
    }

    public String getFullSizedImagePath() {
        return fullSizedImagePath;
    }

    public void setFullSizedImagePath(String fullSizedImagePath) {
        this.fullSizedImagePath = fullSizedImagePath;
    }

    public LocalDate getDateSold() {
        return dateSold;
    }

    public void setDateSold(LocalDate dateSold) {
        this.dateSold = dateSold;
    }


}
